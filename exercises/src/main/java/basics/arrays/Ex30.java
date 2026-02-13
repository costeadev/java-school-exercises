package basics.arrays;

import java.util.Arrays;

public class Ex30 {

    static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 6, 9, 4, 2, 26};

    public static void main(String[] args) {
        int[] evenNumbers = evenArrayOf(numbers);
        int[] oddNumbers = oddArrayOf(numbers);
        int[] largestArray = largestOfTwoArrays(evenNumbers, oddNumbers);

        int totalSize = evenNumbers.length + oddNumbers.length;
        int[] commonArray = new int[totalSize];

        int commonPlaces = Math.min(evenNumbers.length, oddNumbers.length);
        for (int i = 0; i < commonPlaces; i++) {
            commonArray[i * 2] = evenNumbers[i];
            commonArray[i * 2 + 1] = oddNumbers[i];
        }

        int leftoverIndex = commonPlaces * 2;
        int leftoverStart = commonPlaces;
        if (evenNumbers.length > oddNumbers.length) {
            for (int i = leftoverStart; i < evenNumbers.length; i++) {
                commonArray[leftoverIndex++] = evenNumbers[i];
            }
        } else {
            for (int i = leftoverStart; i < oddNumbers.length; i++) {
                commonArray[leftoverIndex++] = oddNumbers[i];
            }
        }
        // Add the ones left over
        for (int i = commonPlaces * 2; i < totalSize; i++) {
            commonArray[i] = largestArray[i - commonPlaces];
        }

        System.out.println(Arrays.toString(evenNumbers));
        System.out.println(Arrays.toString(oddNumbers));
        System.out.println(Arrays.toString(commonArray));
    }

    private static int[] largestOfTwoArrays(int[] array1, int[] array2) {
        if (array1.length > array2.length) return array1;
        else return array2;
    }

    private static int[] evenArrayOf(int[] array) {
        int[] evenNumbers = new int[0];
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers = push(number, evenNumbers);
            }
        }
        return evenNumbers;
    }

    private static int[] oddArrayOf(int[] array) {
        int[] oddNumbers = new int[0];
        for (int number : numbers) {
            if (number % 2 == 1) {
                oddNumbers = push(number, oddNumbers);
            }
        }
        return oddNumbers;
    }

    private static int[] push(int value, int[] array) {
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = value;
        return newArray;
    }
}
