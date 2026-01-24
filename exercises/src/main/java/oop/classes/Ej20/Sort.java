package oop.classes.Ej20;

public class Sort {
    static int partition(Pais[] arr, int low, int high) {
        int pivot = arr[high].getHabitantes();
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (arr[j].getHabitantes() > pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    static void swap(Pais[] arr, int i, int j) {
        Pais temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quickSort(Pais[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}
