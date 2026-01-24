package my_tests;

import java.util.Scanner;

public class ManualAbsoluteOfANumber {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce number 1: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce number 2: ");
        double num2 = scanner.nextDouble();

        scanner.close();


        double resta = num1 - num2; // 22 - 12 = 10 / 12 - 12 = -10

        boolean esPositivo = (resta > 0);
        //10    //-10  - -10   - -10
        double resultado = esPositivo ? resta : (resta - resta - resta);

        System.out.println(resultado);
    }
}
