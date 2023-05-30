import java.util.Scanner;

public class inventory {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[][] dativ = { { "101", "Mobile", "25" }, { "102", "Laptop", "25" }, { "103", "Tablet", "25" },
                { "104", "Portable HDD", "25" }, { "105", "Bluetooth Headphone", "25" }, { "106", "Smart-Watch", "25" },
                { "107", "Digital Camera", "25" }, { "108", "Portable Power bank", "25" }, { "109", "Printer", "25" },
                { "110", "Wireless Router", "25" } };
        int clanth = dativ.length;

        System.out.println(
                "-----------------------------------------------------------------------------------------------------");
        System.out.println("Welcome to the SmartPoint Electronics Store");
        System.out.println(
                "-----------------------------------------------------------------------------------------------------");
        System.out.println("1. View the complete list of our products");
        System.out.println("2. Check the available count for a specific product");
        System.out.println(
                "3. Modify the details of a specific product\n 4. Update the inventory for a specific product\n 5. Exit");
        System.out.println("Please choose an option from the above menu:");

        System.out.println(
                "-----------------------------------------------------------------------------------------------------");
        int key = scn.nextInt();
        String q = "Y";
        while (q.equals("Y")) {
            switch (key) {
                case 1:
                    System.out.println(
                            "\nList of all Products\n-----------------------------------------------------------------------------------------------------");
                    System.out.println(
                            "Product ID \nProduct Name\n101      Mobile\n102     Laptop\n103     Tablet\n104     Portable HDD\n105       Bluetooth Headphone\n106        Smart-watch\n107        Digital Camera\n108     Portable Power bank\n109        Printer\n110        Wireless Router");
                    System.out.println("Do you want to continue?");
                    q = scn.next();
                    break;
                case 2:
                    System.out.println("Enter the product ID: ");
                    String id = scn.next();
                    for (int i = 1; i < dativ.length; i++) {
                        if (dativ[i][0].equals(id)) {
                            System.out.println(dativ[i][0] + dativ[i][1] + dativ[i][2]);
                            System.out.println("Total available count : " + dativ[i][2]);
                            System.out.println("Do you want to continue?");
                            q = scn.next();
                            break;
                        }

                    }
                case 3:
                    System.out.println("Enter the product ID: ");
                    String id1 = scn.next();
                    for (int i = 1; i < dativ.length; i++) {
                        if (dativ[i][0].equals(id1)) {
                            System.out.println(dativ[i][0] + dativ[i][1] + dativ[i][2]);
                            System.out.println("Total available count : " + dativ[i][2]);
                            System.out.println(
                                    "Compatibility - ios and Android | Water Resistance | Battery Life - 2days | GPS, fitness tracking, sleep monitoring, step counting, and more");
                            System.out.println("Do you want to continue?");
                            q = scn.next();
                            break;
                        }
                    }

                case 4:
                    System.out.println("Enter the product ID : ");
                    String id2 = scn.next();
                    for (int i = 1; i < dativ.length; i++) {
                        if (dativ[i][0].equals(id2)) {
                            System.out.println("Enter Product Name To Be Modified ");
                            String pname = scn.next();
                            dativ[i][1] = pname;
                            System.out.println("Enter Product Count To Be Modified ");
                            String pcount = scn.next();
                            dativ[i][2] = pcount;
                            System.out.println("Product Details Modified " + dativ[i][0] + dativ[i][1] + dativ[i][2]);
                            System.out.println("Do you want to continue?");
                            q = scn.next();
                            break;
                        }
                    }

                case 5:
                    System.out.println("Enter the new product ID : ");
                    String id3 = scn.next();
                    clanth = clanth + 1;
                    dativ[clanth][0] = id3;
                    System.out.println("Enter the new product Name : ");
                    String pname = scn.next();
                    dativ[clanth][1] = pname;
                    System.out.println("Enter the new product Count : ");
                    String pcount = scn.next();
                    dativ[clanth][2] = pcount;
                    System.out
                            .println("Product Details Added " + dativ[clanth][0] + dativ[clanth][1] + dativ[clanth][2]);
                    System.out.println("Do you want to continue?");
                    q = scn.next();
                    break;
                case 6:
                    q = "N";
                    break;

                default:
                    break;

            }
        }
        scn.close();
    }
}
