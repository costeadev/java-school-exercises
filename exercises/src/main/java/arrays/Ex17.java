package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex17 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        // Read and create array
        int[] numArray = new int[6];
        int elementsToRead = numArray.length - 1;
        for (int i = 0; i < elementsToRead; i++) {
            System.out.print("Introduce un numero: ");
            numArray[i] = scanner.nextInt();
        }

        // Read and store the number to add
        System.out.print("Introduce otro numero: ");
        int numToAdd = scanner.nextInt();

        scanner.close();


        // Print original array
        System.out.printf("\nOriginal array: %s", Arrays.toString(numArray));


        // Find out the index where 'numToAdd' belongs
        int numToAddIndex = numArray.length - 1;
        for (int i = 0; i < elementsToRead; i++) {
            if (numArray[i] >= numToAdd) {
                numToAddIndex = i;
                break;
            }
        }


        // Make space by moving numbers after 'numToAddIndex ' to the right
        for (int i = elementsToRead; i > numToAddIndex; i--) {
            numArray[i] = numArray[i - 1];
        }

        // Add 'numToAdd' to the corresponding index
        numArray[numToAddIndex] = numToAdd;

        // Print new array :)
        System.out.printf("\nModified array: %s", Arrays.toString(numArray));
    }
}
