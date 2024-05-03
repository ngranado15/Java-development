package com.pluralsight;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

public class OnlineStore {
    static Scanner in = new Scanner(System.in);
    

    public static void main(String[] args) {
        // Menu
        ArrayList<Product> products = getInventoryOfProducts();

       System.out.println("Welcome to our Online Store!");
       int command;
       System.out.println("1 - Display all products ");
       System.out.println("2 - Add product ");
       System.out.println("3 - Remove product ");
       System.out.println("4 - Return to menu");
       System.out.println("5 - Exit");

        command = in.nextInt();
        while (command != 6) {
            switch (command) {
                case 1:
                    displayAllProducts(products);
                    break;
                case 2:
                    addProducts(products);
                    break;
                case 3:
                    removeProduct(products);
                    break;
                case 4:
                    System.out.println("Welcome to our Online Store!");
                    System.out.println("1 - Display all products ");
                    System.out.println("2 - Add product ");
                    System.out.println("3 - Remove product ");
                    System.out.println("4 - return to menu");
                    System.out.println("5 - Exit");
                    command = in.nextInt();
                    break;
                case 5:
                    return;
            }
            System.out.println("Enter another command:");
            command = in.nextInt();
            in.nextLine();
        }
    }
    
    private static void removeProduct(ArrayList<Product> products) {
        System.out.println("What product do you want to remove?");
        String productName = in.nextLine();
        products.removeIf(p -> p.getProductName().equals(productName));
    }

    private static void addProducts(ArrayList<Product> products) {
        System.out.println("What product do you want to add?");
        String productName = in.nextLine();
        in.nextLine();
        System.out.println("What is the product id? ");
        int id = in.nextInt();
        in.nextLine();
        System.out.println("What is the price of the product?");
        double price = in.nextDouble();
        in.nextLine();
        System.out.println("What department is it in?");
        String department = in.nextLine();
        in.nextLine();
        Product product = new Product(id, productName, price, department);
        products.add(product);
        System.out.println(product);
    }

    private static void displayAllProducts(ArrayList<Product> products) {
        for(Product product : products){
            System.out.println(product);
        }
    }



    public static ArrayList<Product> getInventoryOfProducts() {
        ArrayList<Product> inventory = new ArrayList<>();
        try (
            FileReader fr = new FileReader("products.csv");
            BufferedReader br = new BufferedReader(fr)) {
            String line;//to store our lines
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\|");
                try {
                    int id = Integer.parseInt(data[0]);
                    String productName = data[1];
                    double price = Double.parseDouble(data[2]);
                    String department = data[3];
                    Product product = new Product(id, productName, price, department );
                    inventory.add(product);
                } catch (NumberFormatException e) {
                    System.err.println("Skipping invalid product data: " + line);
                    br.close();
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        return inventory;
    }
}