//Comilang, Tayshaun M.
//CITCS 1N-A
//September 30, 2024

package com.mycompany.restaurant;
import java.util.Scanner;
public class Restaurant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuChoice, quantity;
        double totalAmount = 0;
        
        while (true) {
            
            //Display the menu
            System.out.println("MENU");
            System.out.println("1. Burger - PHP 100");
            System.out.println("2. Fries - PHP 50");
            System.out.println("3. Soda - PHP 30");
            System.out.println("4. Ice Cream - PHP 45");
            System.out.println("5. Exit");
            
            //Get user input for menu selection
            System.out.println("Enter the menu number of your choice: ");
            menuChoice = scanner.nextInt();
            
            //Exit the Condition
            if (menuChoice == 5) {
                System.out.println("Thank you for visiting!");
                break;
            }
            
            //Validate menu choise
            if (menuChoice < 1 || menuChoice > 4) {
                System.out.println("Invalid choice. Please select a valid menu item.");
                continue;
            }
            
            // Get user input for quantity
            System.out.print("Enter the quantity: ");
            quantity = scanner.nextInt();
            
            //Validate quantity
            if (quantity <=0) {
                System.out.println("Inavlid quantity. please enter a positive integer.");
                continue;
            }
            
            //Calculate total amount based on the selected ite,
            switch (menuChoice) {
                case 1:
                    totalAmount = 100 * quantity;
                    System.out.println("You ordered Burger.");
                    break;
                case 2:
                    totalAmount = 50 * quantity;
                    System.out.println("You ordered Fries.");
                    break;
                case 3:
                    totalAmount = 30 * quantity;
                    System.out.println("You ordered Soda.");
                    break;
                case 4:
                    totalAmount = 45 * quantity;
                    System.out.println("You ordered Ice Cream.");
                    break;
                
            }
            
            //Display the total amount
            System.out.printf("Total amount: PHP %.2f%n", totalAmount);
        }    
        
        //Close the scanner
        scanner.close();
      
    }
}
