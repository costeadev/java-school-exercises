package my_tests;

import java.util.Scanner;

/**
 * El programa ofrece en primer lugar por pantalla estas posibilidades:

 * 1. Ordenar un primer plato que vale 8 euros
 * 2. Ordenar un segundo plato que vale 10 euros
 * 3. Ordenar un postre que vale 5 euros
 * 4. Pedir cuenta

 * A continuación, el programa irá pidiendo repetidamente al usuario que indique una de las opciones
 * anteriores, hasta que se introduzca “Pedir cuenta”.

 * Cuando el usuario pide la cuenta, mostrará la cantidad a pagar, que se calculará de la siguiente forma:
 * - por cada “menú completo” (compuesto por 1 2 y 3) se aplica el precio menú: 20 euros.
 * - Por cada plato restante, se aplicará el precio normal.
 * - si un cliente gasta 51 euros o más se le aplicará al total un descuento del 10%.
 */

public class MockExam2 {
    public static void main(String[] args) {

        // Menu opciones
        System.out.println("Bienvenido a Casa Alberto!\n");
        System.out.println("--- MENU DEL DIA ---");
        System.out.println("1. Ordenar un primer plato");
        System.out.println("2. Ordenar un segundo plato");
        System.out.println("3. Ordenar un postre");
        System.out.println("4. Pedir la cuenta\n");

        // Declaracion variables
        int menusCompletos = 0;
        int primerosPlatos = 0;
        int segundosPlatos = 0;
        int postres = 0;

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            // Leer opcion del usuario
            System.out.print("Elige una opcion (1-4): ");
            opcion = scanner.nextInt();

            // Sumar al total en base a la opcion
            switch (opcion) {
                case 1: // Primer plato
                    System.out.println("Has ordenado un primer plato");
                    primerosPlatos++;
                    break;
                case 2: // Segundo plato
                    System.out.println("Has ordenado un segundo plato");
                    segundosPlatos++;
                    break;
                case 3: // Postre
                    System.out.println("Has ordenado un postre");
                    postres++;
                    break;
                case 4: // Pedir la cuenta
                    break;
                default: // Opcion fuera de rango
                    System.out.println("Opcion fuera del rango valido.");
                    break;
            }
        } while (opcion != 4);
        scanner.close();

        // Calcular los menus completos
        while (primerosPlatos > 0 && segundosPlatos > 0 && postres > 0) {
            menusCompletos++;
            primerosPlatos--;
            segundosPlatos--;
            postres--;
        }

        // Calcular total
        double total = menusCompletos * 20
                     + primerosPlatos * 8
                     + segundosPlatos * 10
                     + postres * 5;

        boolean tieneDescuento = total >= 51;

        // Añadir descuento del 10%
        if (tieneDescuento) total *= 0.9;

        System.out.println("\nAqui tienes la cuenta :)");

        // Imprimir cuenta
        System.out.println("\n--- CUENTA ---");
        System.out.printf("%d Menu Completo...%d€%n", menusCompletos, menusCompletos * 20);
        System.out.printf("%d Primer Plato...%d€%n", primerosPlatos, primerosPlatos * 8);
        System.out.printf("%d Segundo Plato...%d€%n", segundosPlatos, segundosPlatos * 10);
        System.out.printf("%d Postre...%d€%n", postres, postres * 5);

        if (tieneDescuento) System.out.println("\nDESCUENTO...10%");
        System.out.printf("TOTAL...%.2f€", total);

    }
}

