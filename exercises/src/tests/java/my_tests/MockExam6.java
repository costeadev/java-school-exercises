package my_tests;

import java.util.Scanner;

public class MockExam6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuanto numeros quieres en el array?: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Introduce el numero en la posicion %d: ", i + 1);
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Introduce un objetivo: ");
        int objetivo = scanner.nextInt();
        scanner.close();

        System.out.printf("Hay una suma?: %s",
                            existeSuma(numbers, objetivo) ? "si" : "no");
    }

    public static boolean existeSuma(int[] numbers, int objetivo) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == objetivo) return true;
            }
        }
        return false; // En caso de no encontrar suma
    }
}
