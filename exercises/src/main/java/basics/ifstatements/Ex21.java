package basics.ifstatements;

import java.util.Scanner;

/*
 * Pedir los coeficientes de una ecuación se 2° grado, y muestre sus soluciones reales. Si no existen debe indicarlo.
 *
 * Recuerda:
 * 1. asumiendo ax2+bx+c=0 el determinante se calcula como b2-4ac. Si el determinante es negativo no existen soluciones reales.
 * 2. Las soluciones se encuentran con la formula:
 * 3. en java, la raíz cuadrada de un number n se calcula usando el comando Math.sqrt(n)

 */

public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- RESOLVER ECUACION CUADRATICA ---");
        System.out.println("Esto es una ecuación cuadrática:");
        System.out.println("ax^2 + bx + c = 0\n");

        System.out.print("Introduce el value de 'a': ");
        double a = scanner.nextDouble();

        System.out.print("Introduce el value de 'b': ");
        double b = scanner.nextDouble();

        System.out.print("Introduce el value de 'c': ");
        double c = scanner.nextDouble();

        double determinant = Math.pow(b, 2) - 4 * a * c;

        if (determinant < 0) {
            System.out.println("No hay soluciones reales");
        } else if (determinant == 0) {
            double x = -b / (2 * a);
        } else {
            double x1 = (-b + Math.sqrt(determinant)) / (2 * a);
            double x2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.printf("Las soluciones son x1 = %.2f y x2 = %.2f%n", x1, x2);
        }

        scanner.close();
    }
}
