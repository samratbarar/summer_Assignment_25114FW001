package summer_Assignment_25114FW001.Day_29;

import java.util.*;

// Write a program to Create inventory management system.

class Product {
    private int productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product ID: " + productId + " | Name: " + productName + " | Quantity: " + quantity + " | Price: ₹" + price;
    }
}

class InventorySystem {
    private HashMap<Integer, Product> products;
    private int productIdCounter;
    private final String PRODUCT_NOT_FOUND = "Product not found";

    public InventorySystem() {
        products = new HashMap<>();
        productIdCounter = 1;
    }

    public int addProduct(String name, int quantity, double price) {
        Product product = new Product(productIdCounter, name, quantity, price);
        products.put(productIdCounter, product);
        return productIdCounter++;
    }

    public void updateProduct(int productId, int quantity, double price) {
        if (products.containsKey(productId)) {
            Product product = products.get(productId);
            product.setQuantity(quantity);
            product.setPrice(price);

            System.out.println("Product updated successfully");
        } else {
            System.out.println(PRODUCT_NOT_FOUND);
        }
    }

    public void removeProduct(int productId) {
        if (products.containsKey(productId)) {
            products.remove(productId);
            System.out.println("Product removed successfully");
        } else {
            System.out.println(PRODUCT_NOT_FOUND);
        }
    }

    public void searchProduct(int productId) {
        if (products.containsKey(productId)) {
            System.out.println(products.get(productId));
        } else {
            System.out.println(PRODUCT_NOT_FOUND);
        }
    }

    public void showProducts() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty");
            return;
        }

        System.out.println("--- Inventory Products ---");

        for (Product product : products.values()) {
            System.out.println(product);
        }

        System.out.println("--- End ---");
    }
}

public class Question_116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        InventorySystem inventory = new InventorySystem();

        while (true) {
            System.out.println("\n--- Inventory Management Menu ---");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Remove Product");
            System.out.println("4. Search Product");
            System.out.println("5. Show All Products");
            System.out.println("6. Exit");

            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Quantity: ");
                    int quantity = sc.nextInt();

                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    int id = inventory.addProduct(name, quantity, price);
                    System.out.println("Product added successfully! Product ID: " + id);
                }

                case 2 -> {
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();

                    System.out.print("New Quantity: ");
                    int quantity = sc.nextInt();

                    System.out.print("New Price: ");
                    double price = sc.nextDouble();

                    inventory.updateProduct(id, quantity, price);
                }

                case 3 -> {
                    System.out.print("Enter Product ID: ");
                    inventory.removeProduct(sc.nextInt());
                }

                case 4 -> {
                    System.out.print("Enter Product ID: ");
                    inventory.searchProduct(sc.nextInt());
                }

                case 5 -> {
                    inventory.showProducts();
                }

                case 6 -> {
                    System.out.println("Goodbye!");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid choice");
            }
        }
    }
}