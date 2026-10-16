package com.pluralsight;

import java.util.Scanner;

public class SandwichShop{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1:
        // Prompt the user for the size of the sandwich (1 or 2)
        // 1: Regular: base price sandwich $ 5.45
        // 2: Large: base price sandwich $ 8.95
        System.out.println("Select a sandwich size (1 = Regular, 2 = Large): ");
        int sandwichSize = scanner.nextInt();

        double basePrice = 0.00;

        if (sandwichSize == 1) {
            basePrice = 5.45;
        } else if (sandwichSize == 2) {
            basePrice = 8.95;
        } else {
            System.out.println("Invalid size. Please run the program again and enter 1 or 2 ");
            scanner.close();
            return;
        }

            // Prompt the user for their age:
            // 1: Student (17 years or younger) - receives a 10% discount
            // 2: Seniors (65 years or older) - receives a 20% discount
            // Display the cost of the sandwich on the screen
            System.out.println("Enter your age: ");
            int customerAge = scanner.nextInt();

            double discountRate = 0;

            if (customerAge <= 17) {
                discountRate = 0.10;
            } else if (customerAge >= 65) {
                discountRate = 0.20;
            } else {
                discountRate = 0;
            }

            double discountAmount = basePrice * discountRate;
            double totalPrice = basePrice - discountAmount;

            System.out.printf("Your sandwich cost is $%.2f", totalPrice);

            scanner.close();

            // Step 2
            // Ensure all of your changes are committed and pushed to GitHub
            // Send your repository URL to your instructor}


        }
    }

