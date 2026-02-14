package oop.interfaces.deliverymanagement;

public interface Trackable {
    ShipmentStatus getStatus();
    void updateStatus(ShipmentStatus newStatus);
}
