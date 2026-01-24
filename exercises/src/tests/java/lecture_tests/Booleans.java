package lecture_tests;

import java.util.Scanner;

public class Booleans {
    public static void main(String[] args) {

        // Lectura por teclado
        Scanner scanner = new Scanner(System.in);

        System.out.print("Exam mark: ");
        int examMark = scanner.nextInt();

        System.out.print("Make-up exam mark: ");
        int makeupMark = scanner.nextInt();

        scanner.close();

        // The student passes if the mark is greater or equal to 5
        // Or if the average mark is greater or equal to 5
        boolean passed = examMark >= 5 | (examMark + makeupMark) / 2 >= 5;

        // If the student doesn't pass the exam and doesn't go to the make-up exam (-1). We notice their parents.
        boolean noticeNeeded = examMark <= 5 && makeupMark == -1;

        System.out.println((examMark + makeupMark) / 2);
        System.out.println("Has the student passed?: " + passed);
        System.out.println("Must we notice their papis?: " + noticeNeeded);

    }
}
