package oop.interfaces.deliverymanagement;

import java.util.ArrayList;
import java.util.List;

public class ShipmentCenter {

    private final List<Shipment> shipments;

    public ShipmentCenter() {
        this.shipments = new ArrayList<>();
    }

    public void registerShipment(Shipment shipment) {
        if (shipment == null) {
            throw new IllegalArgumentException("Shipment can't be null");
        }

        if (shipments.contains(shipment)) {
            throw new UnsupportedOperationException("Can't add a duplicate shipment");
        }

        shipments.add(shipment);
    }

    public void listShipments() {
        for (Shipment s : shipments) {
            System.out.println(s);
        }
    }

    public double calculateTotalCost() {
        double total = 0;
        for (Shipment s : shipments) {
            total += s.calculateCost();
        }
        return total;
    }

    public double calculateTotalInsuranceCost() {
        double total = 0;
        for (Shipment s : shipments) {
            if (s instanceof Insurable insurableShipment) {
                total += insurableShipment.calculateInsuranceCost();
            }
        }
        return total;
    }

    public void updateShipmentStatus(int code, ShipmentStatus newStatus) {
        Shipment shipment = findShipmentByCode(code);

        if (shipment == null) {
            throw new IllegalArgumentException("Shipment not found");
        }

        if (!(shipment instanceof Trackable trackableShipment)) {
            throw new IllegalArgumentException("Shipment can't have a status (Not trackable)");
        }

        trackableShipment.updateStatus(newStatus);
    }

    public Shipment findShipmentByCode(int searchCode) {
        for (Shipment s : shipments) {
            if (s.getCode() == searchCode) {
                return s;
            }
        }
        return null;
    }
}
