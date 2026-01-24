package basics.arrays;

import java.util.Scanner;

/**
 * Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo.
 * Cada grupo (o clase) está compuesto por 5 students.
 * Se pide leer las notas del primer, segundo y tercer trimestre de un grupo.
 * Debemos mostrar al final:
 * - La nota media del grupo en cada trimestre
 * - La media del student que se encuentra en la posición N (N se lee por teclado).
 */

public class Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] firstTrimesterGrades = new double[5];
        for (int i = 0; i < firstTrimesterGrades.length; i++) {
            double grade;
            do {
                System.out.printf("Que nota ha sacado el student %d en el primer trimestre?: ", i + 1);
                grade = scanner.nextDouble();
            } while (grade < 0 || grade > 10);
            firstTrimesterGrades[i] = grade;
        }

        double[] secondTrimesterGrades = new double[5];
        for (int i = 0; i < secondTrimesterGrades.length; i++) {
            double grade;
            do {
                System.out.printf("Que nota ha sacado el student %d en el segundo trimestre?: ", i + 1);
                grade = scanner.nextDouble();
            } while (grade < 0 || grade > 10);
            secondTrimesterGrades[i] = grade;
        }

        double[] thirdTrimesterGrades = new double[5];
        for (int i = 0; i < thirdTrimesterGrades.length; i++) {
            double grade;
            do {
                System.out.printf("Que nota ha sacado el student %d en el tercer trimestre?: ", i + 1);
                grade = scanner.nextDouble();
            } while (grade < 0 || grade > 10);
            thirdTrimesterGrades[i] = grade;
        }

        int selectedStudent;
        do {
            System.out.print("De que student quieres ver la media? (1-5): ");
            selectedStudent = scanner.nextInt() - 1;
        } while (selectedStudent < 1 || selectedStudent > 5);

        scanner.close();

        double firstTrimesterTotal = 0;
        for (double grade : firstTrimesterGrades) {
            firstTrimesterTotal += grade;
        }
        double firstTrimesterAverage = firstTrimesterTotal / firstTrimesterGrades.length;

        double secondTrimesterTotal = 0;
        for (double grade : secondTrimesterGrades) {
            secondTrimesterTotal += grade;
        }
        double secondTrimesterAverage = secondTrimesterTotal / secondTrimesterGrades.length;

        double thirdTrimesterTotal = 0;
        for (double grade : thirdTrimesterGrades) {
            thirdTrimesterTotal += grade;
        }
        double thirdTrimesterAverage = thirdTrimesterTotal / thirdTrimesterGrades.length;

        double selectedStudentAverage =
                (firstTrimesterGrades[selectedStudent] +
                        secondTrimesterGrades[selectedStudent] +
                        thirdTrimesterGrades[selectedStudent]) / 3;

        System.out.printf("%nMedia 1er trimestre: %.2f", firstTrimesterAverage);
        System.out.printf("%nMedia 2ndo trimestre: %.2f", secondTrimesterAverage);
        System.out.printf("%nMedia 3er trimestre: %.2f", thirdTrimesterAverage);
        System.out.printf("%nMedia student %d: %.2f", selectedStudent + 1, selectedStudentAverage);
    }
}
