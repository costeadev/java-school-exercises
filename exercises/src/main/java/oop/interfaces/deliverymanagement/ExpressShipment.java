package oop.interfaces.deliverymanagement;

public class ExpressShipment extends Shipment implements Insurable, Trackable {

    private final double urgencyFee;
    private ShipmentStatus status = ShipmentStatus.CREATED;

    public ExpressShipment(double weightKg, String origin, String destination, double urgencyFee) {
        super(weightKg, origin, destination);
        this.urgencyFee = urgencyFee;
    }

    /* === OVERRIDEN METHODS === */

    @Override
    public double calculateCost() {
        return 5.0 + getWeightKg() * 2.0 + urgencyFee;
    }

    @Override
    public double calculateInsuranceCost() {
        return 1.5 + getWeightKg() * 0.8;
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
