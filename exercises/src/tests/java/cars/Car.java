package cars;

import java.util.Scanner;

public class Car {
    String brand;
    String color;
    int horsePower;

    public void start() {
        System.out.println("STUTUTU....BRRRRRRRRRRRRRR");
    }

    public void readInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Brand: ");
        brand = scanner.nextLine();

        System.out.print("Color: ");
        color = scanner.nextLine();

        System.out.print("Horse power: ");
        horsePower = Integer.parseInt(scanner.nextLine());
    }


    public void showInfo() {
        System.out.println(brand);
        System.out.println(color);
        System.out.println(horsePower);
    }


}
