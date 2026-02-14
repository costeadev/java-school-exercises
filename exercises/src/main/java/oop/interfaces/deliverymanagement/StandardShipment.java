package oop.interfaces.deliverymanagement;

public class StandardShipment extends Shipment implements Trackable {

    private final int estimatedDays;
    private ShipmentStatus status = ShipmentStatus.CREATED;

    public StandardShipment(double weightKg, String origin, String destination, int estimatedDays) {
        super(weightKg, origin, destination);
        this.estimatedDays = estimatedDays;
    }

    /* === OVERRIDEN METHODS === */

    @Override
    public double calculateCost() {
        double surcharge = (estimatedDays <= 2) ? 2.5 : 0;
        return 3.0 + getWeightKg() * 1.2 + surcharge;
    }

    @Override
    public ShipmentStatus getStatus() {
        return status;
    }

    @Override
    public void updateStatus(ShipmentStatus newStatus) {
        status = newStatus;
    }
}
