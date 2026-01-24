package basics.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Como el anterior, pero desplazar N posiciones (N es introducido por el usuario).
 */
public class Ex16TwoArrays {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] numbers = new int[10];
    for(int i = 0; i < numbers.length; i++) {
      System.out.printf("Introduce el numero en posicion %d: ", i + 1);
      numbers[i] = scanner.nextInt();
    }
    System.out.printf("Introduce un numero de saltos: ");
    int jumps = scanner.nextInt();

    scanner.close();

    System.out.printf("%nOriginal array: %s%n", Arrays.toString(numbers));

    int[] scrambledNumbers = new int[10];
    int lastIndex = numbers.length - 1;


    for (int i = 0; i < numbers.length; i++) {
      int newIndex = i  + jumps;
      while (newIndex > lastIndex) newIndex -= lastIndex + 1;
      scrambledNumbers[newIndex] = numbers[i];
    }

    System.out.printf("%nModified array: %s", Arrays.toString(scrambledNumbers));
  }
}

