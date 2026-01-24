package basics.ternaryoperator;

import java.util.Scanner;

/*
 * Diseña un programa que lea por teclado
 * una variable entera para representar
 * la cantidad de productos en stock.
 * Luego, pide al usuario que ingrese una cantidad
 * y muestra un mensaje que diga “hay suficiente stock:”
 * seguido de true si es verdad o false si no lo es
 */

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- COMPROBAR SI HAY STOCK SUFICIENTE ---");

        System.out.print("Stock disponible: ");
        int stock = scanner.nextInt();

        System.out.print("Unidades deseadas: ");
        int unidades = scanner.nextInt();

        boolean hayStock = stock >= unidades;

        System.out.printf("Hay suficiente stock: %b", hayStock);

        scanner.close();
    }
}
