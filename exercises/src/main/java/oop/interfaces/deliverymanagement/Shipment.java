package oop.interfaces.deliverymanagement;

public abstract class Shipment {

    private static int NEXT_INT = 1;
    private final int code;
    private double weightKg;
    private String origin, destination;

    public Shipment(double weightKg, String origin, String destination) {
        this.code = NEXT_INT++;
        this.weightKg = weightKg;
        this.origin = origin;
        this.destination = destination;
    }

    /* === GETTERS === */

    public int getCode() {
        return code;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    /* === SETTERS === */

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /* === PUBLIC METHODS === */

    public abstract double calculateCost();

    /* === OVERRIDEN METHODS === */

    @Override
    public String toString() {
        return String.format("""
                Code: %d
                Weight: %.2fkg
                Origin: %s
                Destination: %s""", code, weightKg, origin, destination);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Shipment other)) {
            return false;
        }

        return code == other.code;
    }
}
