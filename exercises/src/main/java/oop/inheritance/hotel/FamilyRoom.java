package oop.inheritance.hotel;

public class FamilyRoom extends Room {
    private int numberOfDoubleBeds;

    public FamilyRoom(int roomNumber, int numberOfBeds, double pricePerNight, int numberOfDoubleBeds) {
        super(roomNumber, numberOfBeds, pricePerNight);
        this.numberOfDoubleBeds = numberOfDoubleBeds;
    }

    public int getNumberOfDoubleBeds() {
        return numberOfDoubleBeds;
    }

    @Override
    public int getCapacity() {
        return super.getNumberOfBeds() + numberOfDoubleBeds * 2;
    }

    @Override
    public String extraInfo() {
        return String.format("\n%d double beds", numberOfDoubleBeds);
    }
}
