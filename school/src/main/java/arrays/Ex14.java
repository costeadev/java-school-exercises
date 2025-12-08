package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Diseñar una aplicación que declare un array de 10 elementos enteros.
 * Leer mediante el teclado 8 números y guardarlos en el array.
 * Después se debe pedir otro número y una posición del array.
 * Insertar el número en la posición indicada, desplazando los que estén detrás de una posición.
 * Ejemplo:
 * Array: 2 5 4 7 3 7 8 9
 * Valor para insertar: 1
 * Posición: 4
 * Resultado: 2 5 4 7 1 3 7 8 9
 */
public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        for(int i = 0; i < 8; i++) {
            System.out.printf("Introduce el numero en posicion %d: ", i + 1);
            numbers[i] = scanner.nextInt();
        }

        System.out.printf("%nOriginal array: %s%n", Arrays.toString(numbers));

        System.out.printf("Introduce un numero: ");
        int numberToAdd = scanner.nextInt();

        System.out.printf("Introduce la posicion donde insertar ese numero (0-9): ");
        int indexToAdd = scanner.nextInt();
        if (indexToAdd < 0 || indexToAdd > 9) {
            System.out.println("Posicion invalida!");
            scanner.close();
            return;
        }

        scanner.close();

        // Shift elements to the right from the last filled index
        for (int i = numbers.length - 1; i > indexToAdd; i--) {
            numbers[i] = numbers[i - 1];
        }

        numbers[indexToAdd] = numberToAdd;

        System.out.printf("%nModified array: %s", Arrays.toString(numbers));
    }
}

