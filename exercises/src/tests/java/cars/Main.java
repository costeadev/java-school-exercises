package cars;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[3];

        // Create array and read car data
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
            cars[i].readInfo();
        }

        // Show info and start car
        for (Car c : cars) {
            c.showInfo();
            c.start();
        }
    }
}
