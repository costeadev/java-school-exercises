package oop.inheritance.hotel;

import utils.Keyboard;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static void main(String[] args) {
        Hotel hotel = bootstrapHotel();
        runApplication(hotel);
    }

    private static Hotel bootstrapHotel() {
        List<Room> rooms = new ArrayList<>();

        rooms.add(new Room(101, 1, 30));
        rooms.add(new Room(102, 1, 30));
        rooms.add(new Room(111, 2, 60));
        rooms.add(new Room(112, 2, 60));
        rooms.add(new FamilyRoom(121, 2, 120, 1));
        rooms.add(new FamilyRoom(122, 2, 120, 1));

        return new Hotel(rooms);
    }

    private static void runApplication(Hotel hotel) {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println(
                    "\n1. Get available rooms\n" +
                            "2. Check room availability\n" +
                            "3. Book a room\n" +
                            "0. Exit");
            int option = Keyboard.readInt("Choose an option: ");

            switch (option) {
                case 1:
                    availableRoomsFlow(hotel);
                    break;
                case 2:
                    availableRoomFlow(hotel);
                    break;
                case 3:
                    reservationFlow(hotel);
                    
                    break;
                case 0:
                    isRunning = false;
                    break;
                default:
                    System.err.println("Invalid option\n");
                    break;
            }
        }
    }

    public static void reservationFlow(Hotel hotel) {
        System.out.println("=== NEW RESERVATION ===");

        int roomNumber = Keyboard.readInt("Room number: ");
        int numOfGuests = Keyboard.readInt("Number of guests: ");

        LocalDate date = createDate();

        try {
            hotel.reserveRoom(date, roomNumber, numOfGuests);
            System.out.println("Reservation successful.");
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void availableRoomsFlow(Hotel hotel) {
        System.out.println("\n=== GET AVAILABLE ROOMS ===");

        int numOfGuests = Keyboard.readInt("Number of guests: ");
        LocalDate date = createDate();

        List<Room> availableRooms = new ArrayList<>();
        try {
            availableRooms = hotel.getAvailableRooms(date, numOfGuests);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
            return;
        }

        if (availableRooms.isEmpty()) {
            System.out.println("\n=== NO ROOMS AVAILABLE ===");
        } else {
            System.out.println("\n=== AVAILABLE ROOMS ===");
            for (Room r : availableRooms) {
                System.out.println(r);
                System.out.println();
            }
        }
    }

    private static void availableRoomFlow(Hotel hotel) {
        int roomNumber = Keyboard.readInt("Room number: ");
        int numOfGuests = Keyboard.readInt("Number of guests: ");
        LocalDate date = createDate();

        boolean available;
        try {
            available = hotel.isRoomAvailable(roomNumber, date, numOfGuests);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
            return;
        }
        System.out.printf("=== ROOM %d IS %s ===\n", roomNumber, available ? "AVAILABLE" : "NOT AVAILABLE");
    }


    private static LocalDate parseLocalDate(String dateString) {
        try {
            return LocalDate.parse(dateString, DATE_FORMAT);
        } catch (DateTimeParseException e) {
            return null;
        }
    }

    private static LocalDate createDate() {
        LocalDate date;
        while (true) {
            String input = Keyboard.readString("Date (dd-MM-yyyy): ");
            date = parseLocalDate(input);

            if (date != null) { // Date is valid
                break;
            }

            System.out.println("Invalid date format. Try again");
        }
        return date;
    }
}