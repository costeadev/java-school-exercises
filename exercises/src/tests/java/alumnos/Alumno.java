package alumnos;

import java.util.Scanner;

public class Alumno {
    String dni;
    String nombre;
    int edad;


    public void leerDatos(Scanner scan) {
        System.out.print("DNI: ");
        dni = scan.nextLine();
        System.out.print("Nombre: ");
        nombre = scan.nextLine();
        System.out.print("Edad: ");
        edad = Integer.parseInt(scan.nextLine());
    }

    public void mostrarDatos() {
        System.out.printf("\n\nDNI: %s", dni);
        System.out.printf("\nNombre: %s", nombre);
        System.out.printf("\nEdad: %s", edad);
    }

    public void mayusculitas() {
        nombre = nombre.toUpperCase();
    }
}
