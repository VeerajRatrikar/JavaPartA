package veeraj1;

import java.util.Scanner;

// Customer class with attributes and a constructor
class Customer {
    String CustID;
    String Name;
    int Age;
    long Phone; // Use long for phone numbers
    String Place;

    // Constructor to initialize the customer object
    public Customer(String custID, String name, int age, long phone, String place) {
        this.CustID = custID;
        this.Name = name;
        this.Age = age;
        this.Phone = phone;
        this.Place = place;
    }

    // Override toString method to print customer details
    @Override
    public String toString() {
        return "Customer ID: " + CustID + "\n" +
               "Name: " + Name + "\n" +
               "Age: " + Age + "\n" +
               "Phone: " + Phone + "\n" +
               "Place: " + Place + "\n";
    }


public class Pgm7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of customers
        System.out.print("Enter the number of customers: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Create an array to store customer objects
        Customer[] customers = new Customer[n];

        // Input details for each customer
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for customer " + (i + 1) + ":");

            System.out.print("Customer ID: ");
            String custID = scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();

            System.out.print("Phone: ");
            long phone = scanner.nextLong();
            scanner.nextLine(); // Consume newline

            System.out.print("Place: ");
            String place = scanner.nextLine();

            // Create a new Customer object and add it to the array
            customers[i] = new Customer(custID, name, age, phone, place);
        }

        // Print all customer information
        System.out.println("\nCustomer Information:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        scanner.close();
    }
}
}
