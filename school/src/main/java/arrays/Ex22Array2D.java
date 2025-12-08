package arrays;

import java.util.Scanner;

/**
 * Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo.
 * Cada grupo (o clase) está compuesto por 5 alumnos.
 * Se pide leer las notas del primer, segundo y tercer trimestre de un grupo.
 * Debemos mostrar al final:
 *   - La nota media del grupo en cada trimestre
 *   - La media del alumno que se encuentra en la posición N (N se lee por teclado).
 */

public class Ex22Array2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int trimesters = 3;
        int students = 5;

        double[][] gradesPerTrimester = new double[trimesters][students];
        for (int i = 0; i < trimesters; i++) {
            for (int j = 0; j < students; j++) {
                double grade;
                do {
                    System.out.printf("Introduce nota del trimestre %d para alumno %d: ", i + 1, j + 1);
                     grade = scanner.nextDouble();
                } while (grade < 0 || grade > 10);
                gradesPerTrimester[i][j] = grade;
            }
        }

        int selectedStudent;
        do {
            System.out.print("De que estudiante quieres ver la media? (1-5): ");
            selectedStudent = scanner.nextInt() - 1;
        } while (selectedStudent < 0 || selectedStudent > students - 1);

        scanner.close();


        // Print the average for every trimester
        for (int i = 0; i < trimesters; i++) {
            double total = 0;
            for (int j = 0; j < students; j++) {
                total += gradesPerTrimester[i][j];
            }
            System.out.printf("Media trimestre %d: %.2f%n", i + 1, total / students);
        }

        // Print the average for the selected student
        double selectedStudentTotal = 0;
        for (int i = 0; i < trimesters; i++) {
            selectedStudentTotal += gradesPerTrimester[i][selectedStudent];
        }
        System.out.printf("Media estudiante %d: %.2f",  selectedStudent + 1, selectedStudentTotal / trimesters);

    }
}
