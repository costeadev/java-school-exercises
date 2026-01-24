package basics.ternaryoperator;

import java.util.Scanner;

/*
 * Escribe un programa que lea por teclado
 * tres variables de tipo double para representar
 * las longitudes de los lados de un triángulo.
 * Muestra en pantalla si el triángulo es equilátero o no
 */

public class Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Longitud lado 1: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Longitud lado 2: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Longitud lado 3: ");
        double lado3 = scanner.nextDouble();

        boolean medidasValidas =
                (lado1 > 0 && lado2 > 0 && lado3 > 0) &&
                        (lado1 + lado2 > lado3) &&
                        (lado1 + lado3 > lado2) &&
                        (lado2 + lado3 > lado1);

        String resultado = !medidasValidas
                ? "Las medidas no son válidas"
                : (lado1 == lado2 && lado2 == lado3)
                ? "Equilátero"
                : "No equilátero";

        System.out.println(resultado);

        scanner.close();
    }
}
