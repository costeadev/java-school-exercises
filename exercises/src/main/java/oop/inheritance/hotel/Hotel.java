package oop.inheritance.hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Room> rooms;
    private List<Reservation> reservations;

    public Hotel(List<Room> rooms) {
        this.rooms = rooms;
        reservations = new ArrayList<>();
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void reserveRoom(LocalDate date, int roomNumber, int numOfGuests) {
        validateDate(date);

        if (numOfGuests <= 0) {
            throw new IllegalArgumentException("There must be at least 1 guest");
        }

        Room room = findRoomByNumber(roomNumber);

        if (room == null) {
            throw new IllegalArgumentException("The room doesn't exist");
        }

        if (!isRoomAvailable(room.getRoomNumber(), date, numOfGuests)) {
            throw new IllegalArgumentException(String.format("Room %d already booked", roomNumber));
        }
        reservations.add(new Reservation(date, room, numOfGuests));
    }

    public Room findRoomByNumber(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }

    public List<Room> getAvailableRooms(LocalDate date, int numOfGuests) {
        validateDate(date);

        List<Room> availableRooms = new ArrayList<>();
        for (Room r : rooms) {
            if (isRoomAvailable(r.getRoomNumber(), date, numOfGuests) && r.getCapacity() >= numOfGuests) {
                availableRooms.add(r);
            }
        }
        return availableRooms;
    }

    public boolean isRoomAvailable(int roomNumber, LocalDate date, int numOfGuests) {
        validateDate(date);

        if (findRoomByNumber(roomNumber) == null) {
            throw new IllegalArgumentException("Room doesn't exist");
        }

        for (Reservation r : reservations) {
            if (r.getReservedRoom().getRoomNumber() == roomNumber && r.getDate().isEqual(date)) {
                return false;
            }
        }
        return true;
    }

    private void validateDate(LocalDate date) {
        if (date.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Date must be in the future");
        }
    }
}
