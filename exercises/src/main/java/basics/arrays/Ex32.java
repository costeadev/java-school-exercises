package basics.arrays;

import java.util.Arrays;

public class Ex32 {
    public static void main(String[] args) {
        int[] arr = {3, 2 , 1};
        int[] addedUp = new int[0];

        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
            }
            addedUp = push(addedUp, sum);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(addedUp));
    }

    private static int[] push(int[] arr, int n) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = n;
        return arr;
    }
}
