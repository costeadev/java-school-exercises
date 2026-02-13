package oop.inheritance.hotel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

public class Reservation {
    private LocalDate date;
    private Room reservedRoom;
    private int numberOfGuests;

    public Reservation(LocalDate date, Room reservedRoom, int numberOfGuests) {
        if (date.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Date must be in the future");
        }
        this.date = date;
        this.reservedRoom = reservedRoom;
        if (reservedRoom.getCapacity() < numberOfGuests) {
            throw new IllegalArgumentException("Room can't hold that amount of people");
        }
        this.numberOfGuests = numberOfGuests;
    }

    public LocalDate getDate() {
        return date;
    }

    public Room getReservedRoom() {
        return reservedRoom;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    @Override
    public String toString() {
        return String.format(
                "=== Reservation ===\n" +
                "Date: %s\n" +
                "Num of guests: %d\n" +
                "%s", date, numberOfGuests, reservedRoom);
    }
}
