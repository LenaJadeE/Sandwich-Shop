package com.pluralsight;

import java.util.Scanner;

public class SandwichShopPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1:
        // Prompt the user for the size of the sandwich (1 or 2)
        // 1: Regular: base price sandwich $ 5.45
        // 2: Large: base price sandwich $ 8.95

        //Prompt the user if they would like the sandwich "loaded" (yes/no).
        // If so there is an additional cost for a loaded sandwich
        // 1: Regular: $1.00
        // 2: Large: $1.75

        System.out.println("Select a sandwich size (1 = Regular, 2 = Large): ");
        int sandwichSize = scanner.nextInt();

        double basePrice = 0.00;
        double loadedCost = 0.00;

        if (sandwichSize == 1) {
            basePrice = 5.45;
            loadedCost = 1.00;
        } else if (sandwichSize == 2) {
            basePrice = 8.95;
            loadedCost = 1.75;
        } else {
            System.out.println("Invalid size. Please run the program again and enter 1 or 2 ");
            scanner.close();
            return;
        }

            // This is the loaded sandwich prompt
            System.out.println("Would you like your sandwich loaded? (yes/ no):");
            String isLoadedChoice = scanner.next();

            double finalSandwichPrice = basePrice;
            if (isLoadedChoice.equalsIgnoreCase("yes")){
                finalSandwichPrice += loadedCost;
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

            double discountAmount = finalSandwichPrice * discountRate;
            double totalPrice = finalSandwichPrice - discountAmount;

            System.out.printf("Your sandwich cost is $%.2f", totalPrice);

            scanner.close();

            // Step 2
            // Ensure all of your changes are committed and pushed to GitHub
            // Send your repository URL to your instructor}


        }
    }
