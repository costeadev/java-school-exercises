package basics.forloops;


import java.util.Scanner;

/*
 * Calcula el mínimo, máximo y media de una serie de enteros positivos.
 * Termina cuando se introduce un number negativo.
 */

public class Ex15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int cantidad = 0;
        int number;

        // Bucle principal (termina con number negativo)
        while (true) {
            System.out.print("Introduce otro number: ");
            number = scanner.nextInt();
            if (number < 0) break; // Salir si es negativo

            suma += number;
            cantidad++;

            if (number > maximo) maximo = number;
            if (number < minimo) minimo = number;
        }

        scanner.close();


        System.out.println("\n--- RESULTADOS ---");

        // Evitar división por cero
        if (cantidad == 0) {
            System.out.println("No se introdujeron números positivos.");
            return; // Exit
        }

        double media = (double) suma / cantidad;

        // Salida formateada
        System.out.printf("%d/%d = %.2f (media)%n", suma, cantidad, media);
        System.out.printf("Máximo: %d%n", maximo);
        System.out.printf("Mínimo: %d%n", minimo);
    }
}
