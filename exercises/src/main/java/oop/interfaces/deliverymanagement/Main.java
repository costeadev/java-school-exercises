package oop.interfaces.deliverymanagement;

import javax.sound.midi.Track;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShipmentCenter center = new ShipmentCenter();
        int option;

        do {
            mainMenu();
            System.out.print("Choose an option: ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1 -> addMenu(center, sc);
                case 2 -> center.listShipments();
                case 3 -> updateShipmentStatus(center, sc);
                case 4 -> showTotalCosts(center, sc);
                case 0 -> System.out.println("Exiting...");
                default -> System.err.println("Invalid option");
            }
        } while (option != 0);
    }

    private static void addMenu(ShipmentCenter center, Scanner sc) {
        int option;
        do {
            System.out.println("""
                === SHIPMENT MENU ===
                1. Add Standard Shipment
                2. Add Express Shipment
                3. Add Refrigerated Shipment
                0. Back
                """);
            System.out.print("Choose an option: ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1 -> addStandardShipment(center, sc);
                case 2 -> addExpressShipment(center, sc);
                case 3 -> addRefrigeratedShipment(center, sc);
                case 0 -> System.out.println("Returning...");
                default -> System.err.println("Invalid option");
            }
        } while (option != 0);
    }

    private static void addStandardShipment(ShipmentCenter center, Scanner sc) {
        System.out.print("Weight in kg: ");
        double weightKg = Double.parseDouble(sc.nextLine());

        System.out.print("Origin: ");
        String origin = sc.nextLine();

        System.out.print("Destination: ");
        String destination = sc.nextLine();

        System.out.print("Estimated days: ");
        int estimatedDays = Integer.parseInt(sc.nextLine());

        StandardShipment standardShipment = new StandardShipment(weightKg, origin, destination, estimatedDays);
        try {
            center.registerShipment(standardShipment);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return;
        }
        System.out.printf("Standard shipment succesfully added! Code: %d\n", standardShipment.getCode());
    }

    private static void addExpressShipment(ShipmentCenter center, Scanner sc) {
        System.out.print("Weight in kg: ");
        double weightKg = Double.parseDouble(sc.nextLine());

        System.out.print("Origin: ");
        String origin = sc.nextLine();

        System.out.print("Destination: ");
        String destination = sc.nextLine();

        System.out.print("Urgency fee: ");
        double urgencyFee = Double.parseDouble(sc.nextLine());

        ExpressShipment expressShipment = new ExpressShipment(weightKg, origin, destination, urgencyFee);
        try {
            center.registerShipment(expressShipment);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return;
        }
        System.out.printf("Express shipment succesfully added! Code: %d\n", expressShipment.getCode());
    }

    private static void addRefrigeratedShipment(ShipmentCenter center, Scanner sc) {
        System.out.print("Weight in kg: ");
        double weightKg = Double.parseDouble(sc.nextLine());

        System.out.print("Origin: ");
        String origin = sc.nextLine();

        System.out.print("Destination: ");
        String destination = sc.nextLine();

        System.out.print("Target temperature: ");
        double targetTemperature = Double.parseDouble(sc.nextLine());

        RefrigeratedShipment refrigeratedShipment = new RefrigeratedShipment(weightKg, origin, destination, targetTemperature);
        try {
            center.registerShipment(refrigeratedShipment);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return;
        }
        System.out.printf("Refrigerated shipment succesfully added! Code: %d\n", refrigeratedShipment.getCode());
    }

    private static void updateShipmentStatus(ShipmentCenter center, Scanner sc) {

        System.out.print("Shipment code: ");
        int searchCode = Integer.parseInt(sc.nextLine());

        Shipment shipment = center.findShipmentByCode(searchCode);

        if (shipment == null) {
            System.err.println("Shipment doesn't exist");
            return;
        }

        if (!(shipment instanceof Trackable trackableShipment)) {
            System.err.println("Shipment not trackable");
            return;
        }

        System.out.println("""
                1. CREATED
                2. IN TRANSIT
                3. DELIVERED""");
        System.out.print("Choose an option: ");
        int option = Integer.parseInt(sc.nextLine());

        switch (option) {
            case 1 -> trackableShipment.updateStatus(ShipmentStatus.CREATED);
            case 2 -> trackableShipment.updateStatus(ShipmentStatus.IN_TRANSIT);
            case 3 -> trackableShipment.updateStatus(ShipmentStatus.DELIVERED);
            default -> System.err.println("Invalid option");
        }
    }

    private static void showTotalCosts(ShipmentCenter center, Scanner sc) {
        int option;
        do {
            listMenu();
            System.out.print("Choose an option: ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1 -> System.out.printf("Total cost: $%.2f\n", center.calculateTotalCost());
                case 2 -> System.out.printf("Total insurance cost: $%.2f\n", center.calculateTotalInsuranceCost());
                case 0 -> System.out.println("Returning...");
                default -> System.err.println("Invalid option");
            }
        } while (option != 0);
    }

    private static void mainMenu() {
        System.out.println("""
                1. Add shipment
                2. List shipments
                3. Update shipment status
                4. Show total costs
                0. Exit
                """);
    }

    private static void listMenu() {
        System.out.println("""
                1. Total cost
                2. Insurance total cost
                0. Exit
                """);
    }
}
