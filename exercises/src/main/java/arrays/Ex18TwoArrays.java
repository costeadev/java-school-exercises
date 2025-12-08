package arrays;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Leer por teclado un array de 10 elementos numéricos enteros y una posición (entre 0 y 9).
 * Eliminar el elemento situado en la posición dada sin dejar huecos.
 */
public class Ex18TwoArrays {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] numbers = new int[10];
    for (int i = 0; i < numbers.length; i++) {
      System.out.print("Introduce un numero: ");
      numbers[i] = scanner.nextInt();
    }

    System.out.print("Introduce una posicion a eliminar (0-9): ");
    int indexToRemove = scanner.nextInt();
    if (indexToRemove < 0 || indexToRemove > 9) {
      System.out.println("El valor no es valido.");
      return;
    }

    scanner.close();

    System.out.printf("%nOriginal array: %s%n", Arrays.toString(numbers));

    numbers[indexToRemove] = 0;
    int[] modifiedNumbers = new int[9];

    // Add numbers before
    for (int i = 0; i < indexToRemove; i++) {
      modifiedNumbers[i] = numbers[i];
    }

    // Add numbers after
    for (int i = indexToRemove; i < modifiedNumbers.length; i++) {
      modifiedNumbers[i] = numbers[i + 1];
    }

    System.out.printf("%nModified array: %s%n", Arrays.toString(modifiedNumbers));
  }
}
