package my_tests;

import java.util.Scanner;

//
//  The program initially displays these options on the screen:
//   1. Order a first course for 8 euros
//   2. Order a second course for 10 euros
//   3. Order a dessert for 5 euros
//   4. Request the bill

//   The program will repeatedly ask the user to select one of the above options
//   until "Request the bill" is entered.

//   When the user requests the bill, the program will display the amount due, calculated as follows:
//   - For each "full menu" (consisting of 1, 2, and 3 courses), the menu price of 20 euros applies.
//   - For each additional course, the regular price applies.
//   - If a customer spends 51 euros or more, a 10% discount will be applied to the total.
//

public class MockExam2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu Options
        System.out.println("Welcome to Casa Alberto!\n");
        System.out.println("--- TODAY'S MENU ---");
        System.out.println("1. Order first course");
        System.out.println("2. Order second course");
        System.out.println("3. Order dessert");
        System.out.println("4. Ask for the bill\n");

        int completeMenus = 0;
        int firstCourses = 0;
        int secondCourses = 0;
        int desserts = 0;

        int option;

        do {
            System.out.print("Choose an option (1-4): ");
            option = scanner.nextInt();

            // Add to the total based on the choice
            switch (option) {
                case 1 -> { // First course
                    System.out.println("You have ordered a first course");
                    firstCourses++;
                }
                case 2 -> { // Second course
                    System.out.println("You have ordered a second course");
                    secondCourses++;
                }
                case 3 -> { // Dessert
                    System.out.println("You have ordered a dessert");
                    desserts++;
                }
                case 4 -> {
                    // Request the bill
                }
                default -> {// Option out of range
                    System.out.println("Option out of valid range.");
                }
            }
        } while (option != 4);

        // Calculate complete menus
        while (firstCourses > 0 && secondCourses > 0 && desserts > 0) {
            completeMenus++;
            firstCourses--;
            secondCourses--;
            desserts--;

        }

        // Calculate the total
        double total = completeMenus * 20
                + firstCourses * 8
                + secondCourses * 10
                + desserts * 5;

        boolean hasDiscount = total >= 51;

        // Add 10% discount
        if (hasDiscount) total *= 0.9;

        System.out.println("\nHere is the invoice :)");

        // Print the invoice
        System.out.println("\n--- BILL ---");
        System.out.printf("%d Full Menu...%d€%n", completeMenus, completeMenus * 20);
        System.out.printf("%d First Plate...%d€%n", firstCourses, firstCourses * 8);
        System.out.printf("%d Second Plate...%d€%n", secondCourses, secondCourses * 10);
        System.out.printf("%d Dessert...%d€%n", desserts, desserts * 5);

        if (hasDiscount) System.out.println("\nDISCOUNT...10%");
        System.out.printf("TOTAL...%.2f€", total);

        scanner.close();
    }
}