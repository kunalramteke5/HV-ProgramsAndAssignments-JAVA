import java.util.*;


class MenuItem {
    private String menuID;
    private String name;
    private double price;

    public MenuItem(String menuID, String name, double price) {
        this.menuID = menuID;
        this.name = name;
        this.price = price;
    }

    
}


class Order {
    private String orderID;
    private Map<MenuItem, Integer> items; 
    private double totalBill;
    private String date;
    private String status;

    public Order(String orderID, String date) {
        this.orderID = orderID;
        this.date = date;
        this.items = new HashMap<>();
        this.status = "Pending";
    }

    public void addItem(MenuItem item, int quantity) {
        items.put(item, quantity);
        totalBill += item.getPrice() * quantity;
    }

    public void removeItem(MenuItem item) {
        totalBill -= item.getPrice() * items.get(item);
        items.remove(item);
    }

    public void cancelOrder() {
        status = "Cancelled";
    }

    
}


class CollectionReport {
    private String date;
    private double totalCollection;

    public CollectionReport(String date) {
        this.date = date;
    }

    public void addOrder(Order order) {
        if (order.getStatus().equals("Completed")) {
            totalCollection += order.getTotalBill();
        }
    }

    
}

// Main Class
public class RestaurantApp {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        // Create some menu items
        MenuItem burger = new MenuItem("1", "Burger", 5.99);
        MenuItem fries = new MenuItem("2", "Fries", 2.99);

        // Create an order
        Order order = new Order("1", "2023-11-24");
        System.out.println("Created a new order with ID: " + order.getOrderID());

        // Add items to the order
        System.out.println("Adding a burger to the order...");
        order.addItem(burger, 1);
        System.out.println("Adding fries to the order...");
        order.addItem(fries, 1);

        // Print the total bill
        System.out.println("The total bill is: " + order.getTotalBill());

        // Create a collection report
        CollectionReport report = new CollectionReport("2023-11-24");
        System.out.println("Created a new collection report for date: " + report.getDate());

        // Add the order to the collection report
        System.out.println("Adding the order to the collection report...");
        report.addOrder(order);

        // Print the total collection
        System.out.println("The total collection for the day is: " + report.getTotalCollection());
        
    }
}
