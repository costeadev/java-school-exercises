package basics.arrays;

import java.util.Arrays;

public class Ex29 {

    static int[] numbers = {1, 1, 1, 2, 2, 2, 3, 5, 8, 13, 2, 3, 5, 8, 8, 8};

    public static void main(String[] args) {
        int[] uniqueNumbers = new int[0];
        int[] timesRepeated = new int[0];

        // Get unique numbers and times repeated
        for (int number : numbers) {
            if (contains(number, uniqueNumbers)) {
                int index = getIndex(number, uniqueNumbers);
                timesRepeated[index]++;
            } else {
                uniqueNumbers = push(number, uniqueNumbers);
                timesRepeated = push(1, timesRepeated);
            }
        }

        // Order unique numbers by times repeated (largest to smallest)
        int[] timesRepeatedCopy = Arrays.copyOf(timesRepeated, timesRepeated.length);
        int[] orderedByFrequency = new int[uniqueNumbers.length];

        for (int i = 0; i < uniqueNumbers.length; i++) {
            int index = getIndexOfLargestNumber(timesRepeatedCopy);
            timesRepeatedCopy[index] = 0;
            orderedByFrequency[i] = uniqueNumbers[index];
        }

        System.out.printf("Unique numbers: %s\n", Arrays.toString(uniqueNumbers));
        System.out.printf("Times repeated: %s\n", Arrays.toString(timesRepeated));
        System.out.printf("Ordered by frequency: %s\n", Arrays.toString(orderedByFrequency));
    }

    private static boolean contains(int search, int[] array) {
        for (int number : array) {
            if (number == search) {
                return true;
            }
        }
        return false;
    }

    private static int getIndexOfLargestNumber(int[] array) {
        int largest = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (largest < array[i]) {
                largest = array[i];
                index = i;
            }
        }

        return index;
    }

    private static int getIndex(int search, int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                return i;
            }
        }
        return -1;
    }

    private static int[] push(int num, int[] array) {
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = num;
        return newArray;
    }
}
