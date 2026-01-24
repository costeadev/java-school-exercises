package basics.ternaryoperator;

import java.util.Scanner;

/*
 * Crea un programa que lea por teclado
 * una variable entera para representar
 * la cantidad de unidades vendidas de un producto
 * y otra variable double para representar el precio unitario.
 * Calcula y muestra el monto total de ventas.
 */

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- CALCULAR BENEFICIO VENTAS ---");

        System.out.print("Unidades vendidas: ");
        int unidadesVendidas = scanner.nextInt();

        System.out.print("Precio por unidad: ");
        double precioPorUnidad = scanner.nextDouble();

        double beneficio = calcularBeneficio(unidadesVendidas, precioPorUnidad);
        System.out.printf("Beneficio total: %.2f €", beneficio);

        scanner.close();
    }

    public static double calcularBeneficio(int unidades, double precio) {
        return unidades * precio;
    }
}
