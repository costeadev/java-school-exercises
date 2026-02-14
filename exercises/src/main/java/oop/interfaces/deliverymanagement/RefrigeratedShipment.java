package oop.interfaces.deliverymanagement;

public class RefrigeratedShipment extends Shipment implements Insurable {

    private final double targetTemperature;

    public RefrigeratedShipment(double weightKg, String origin, String destination, double targetTemperature) {
        super(weightKg, origin, destination);
        this.targetTemperature = targetTemperature;
    }

    /* === OVERRIDEN METHODS === */

    @Override
    public double calculateCost() {
        double surcharge = (targetTemperature < 0) ? 4.0 : 0;
        return 6.0 + getWeightKg() * 2.5 + surcharge;
    }

    @Override
    public double calculateInsuranceCost() {
        return 1.5 + getWeightKg() * 0.8;
    }
}
