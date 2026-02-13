package oop.inheritance.hotel;

public class Room {
    private int roomNumber;
    private int numberOfBeds;
    private double pricePerNight;

    public Room(int roomNumber, int numberOfBeds, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.pricePerNight = pricePerNight;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public String extraInfo() {
        return "";
    }

    public int getCapacity() {
        return getNumberOfBeds();
    }

    @Override
    public boolean equals(Object o) {
        // If the object is compared with itself return true
        if (o == this) {
            return true;
        }
        // If the object is not a room, return false
        if (!(o instanceof Room)) {
            return false;
        }

        // Typecast o to Room so we can compare data
        Room r = (Room) o;

        // Check if the room numbers are the same
        return this.getRoomNumber() == r.getRoomNumber();
    }

    @Override
    public String toString() {
        return String.format(
                        "- Room %d -\n" +
                        "$%.2f per night\n" +
                        "%d single beds%s", roomNumber, pricePerNight, numberOfBeds, extraInfo());
    }
}
