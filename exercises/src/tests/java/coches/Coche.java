package coches;

import java.util.Scanner;

public class Coche {
    String marca;
    String color;
    int caballos;

    public void arrancar() {
        System.out.println("STUTUTU....BRRRRRRRRRRRRRR");
    }

    public void leerDatos() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Marca: ");
        marca = scan.nextLine();
        System.out.print("Color: ");
        color = scan.nextLine();
        System.out.print("Caballos: ");
        caballos = Integer.parseInt(scan.nextLine());
    }


    public void mostrarDatos() {
        System.out.println(marca);
        System.out.println(color);
        System.out.println(caballos);
    }


}
