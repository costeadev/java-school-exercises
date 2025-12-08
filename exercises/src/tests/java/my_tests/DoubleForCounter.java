package my_tests;

public class DoubleForCounter {
    public static void main(String[] args) {
        int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0, j = numArray.length - 1; i <= (numArray.length / 2) && j >= (numArray.length / 2); i++, j--) {
            System.out.printf("%d-%d\n", numArray[i], numArray[j]);
        }
    }
}
