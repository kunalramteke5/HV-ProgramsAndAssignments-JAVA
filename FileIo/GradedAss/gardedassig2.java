import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class gardedassig2 {
    private static final String FILE_PATH = "library_catlog.csv"; // File path for saving and loading data
    private static final int MAX_BOOKS = 100; // Maximum number of books in the catalog
    private static final int BOOK_ATTRIBUTES = 5; // Number of attributes for each book

    private static String[][] catalog = new String[MAX_BOOKS][BOOK_ATTRIBUTES]; // Multi-dimensional array for storing books
    private static int bookCount = 0; // Counter for the number of books in the catalog

    public static void main(String[] args) {
        loadCatalog(); // Load catalog data from the CSV file

        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMainMenu();

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    displayAllBooks();
                    break;
                case 2:
                    issueBook(scanner);
                    break;
                case 3:
                    returnBook(scanner);
                    break;
                case 4:
                    saveCatalog(); // Save catalog data to the CSV file
                    System.out.println("\nThank you for visting SmartPoint!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.\n");
            }
        }
    }

    private static void displayMainMenu() {
        System.out.println("\nWelcome to the Unique Library\n");
        System.out.println("1. View the complete list of Books");
        System.out.println("2. Issue a Book");
        System.out.println("3. Return a Book");
        System.out.println("4. Save to CSV file and Exit \n");
        System.out.print("Please choose an option from the above menu: ");
    }

    private static void displayAllBooks() {
        System.out.println("\nList of all Books\n");
        // System.out.println("Book ID\tBook Title\tAuthor\tAvailability\tIssue Date");

        for (int i = 0; i < bookCount; i++) {
            for (int j = 0; j < BOOK_ATTRIBUTES; j++) {
                System.out.print(catalog[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void issueBook(Scanner scanner) {
        System.out.println("\nIssue the Book\n");
        System.out.print("Enter the Book ID: ");
        String bookId = scanner.nextLine();

        int bookIndex = findBookIndex(bookId);

        if (bookIndex == -1) {
            System.out.println("Book not found. Please try again.\n");
            return;
        }

        if (!catalog[bookIndex][3].equals("Available")) {
            System.out.println("Book is not available for issuance. Please try again.\n");
            return;
        }

        System.out.println(catalog[bookIndex][0] + " - " + catalog[bookIndex][1] + " by " + catalog[bookIndex][2]
                + ": " + catalog[bookIndex][3]);
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter 'C' to confirm: ");
        String confirmation = scanner.nextLine();

        if (confirmation.equalsIgnoreCase("C")) {
            catalog[bookIndex][3] = studentId;
            catalog[bookIndex][4] = getCurrentDate();
            System.out.println("BookID: " + catalog[bookIndex][0] + " is issued to " + studentId + "\n");
        } else {
            System.out.println("Book issuance canceled.\n");
        }
    }

    private static void returnBook(Scanner scanner) {
        System.out.println("\nReturn the Book\n");
        System.out.print("Enter the Book ID: ");
        String bookId = scanner.nextLine();

        int bookIndex = findBookIndex(bookId);

        if (bookIndex == -1) {
            System.out.println("Book not found. Please try again.\n");
            return;
        }

        if (catalog[bookIndex][3].equals("Available")) {
            System.out.println("Book is already available in the library. No need to return.\n");
            return;
        }

        System.out.println(bookId + " - " + catalog[bookIndex][1] + " by " + catalog[bookIndex][2]);
        System.out.println("StudentID - " + catalog[bookIndex][3]);
        System.out.println("Issue Date - " + catalog[bookIndex][4]);

        int daysDelayed = getDaysDelayed(catalog[bookIndex][4]);
        double delayedCharges = calculateDelayedCharges(daysDelayed);

        System.out.println("Delayed by - " + daysDelayed + " days");
        System.out.println("Delayed Charges - Rs. " + String.format("%.2f", delayedCharges));

        System.out.print("Enter 'R' to confirm the return: ");
        String confirmation = scanner.nextLine();

        if (confirmation.equalsIgnoreCase("R")) {
            catalog[bookIndex][3] = "Available";
            System.out.println("BookID: " + catalog[bookIndex][0] + " is returned back\n");
        } else {
            System.out.println("Book return canceled.\n");
        }
    }

    private static int findBookIndex(String bookId) {
        for (int i = 0; i < bookCount; i++) {
            if (catalog[i][0].equals(bookId)) {
                return i;
            }
        }
        return -1;
    }

    private static String getCurrentDate() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        return sdf.format(date);
    }

    private static int getDaysDelayed(String issueDate) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
            Date issue = sdf.parse(issueDate);
            Date current = new Date();

            long diff = current.getTime() - issue.getTime();
            return (int) (diff / (24 * 60 * 60 * 1000));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    private static double calculateDelayedCharges(int daysDelayed) {
        if (daysDelayed > 7) {
            int extraDays = daysDelayed - 7;
            return extraDays * 10.0;
        }
        return 0.0;
    }

    private static void loadCatalog() {
        try {
            File file = new File(FILE_PATH);
            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
                String line;
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    String[] attributes = line.split(",");
                    if (attributes.length == BOOK_ATTRIBUTES) {
                        System.arraycopy(attributes, 0, catalog[i], 0, BOOK_ATTRIBUTES);
                        i++;
                    }
                }
                bookCount = i;
                reader.close();
                System.out.println("Catalog data loaded successfully.\n");
            } else {
                System.out.println("No catalog data found. Starting with an empty catalog.\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void saveCatalog() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH));
            for (int i = 0; i < bookCount; i++) {
                for (int j = 0; j < BOOK_ATTRIBUTES; j++) {
                    writer.write(catalog[i][j]);
                    if (j != BOOK_ATTRIBUTES - 1) {
                        writer.write(",");
                    }
                }
                writer.newLine();
            }
            writer.close();
            System.out.println("Catalog data saved successfully.\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
