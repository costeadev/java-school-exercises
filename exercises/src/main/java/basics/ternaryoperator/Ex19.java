package basics.ternaryoperator;

import java.util.Scanner;

/*
 * Diseña un programa que lea de teclado
 * tres variables numéricas para representar
 * las notas de tres asignaturas diferentes.
 * Luego, muestra en pantalla un mensaje que indique
 * si el estudiante aprueba el curso o repite.
 */

public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota asignatura 1: ");
        int nota1 = scanner.nextInt();

        System.out.print("Nota asignatura 2: ");
        int nota2 = scanner.nextInt();

        System.out.print("Nota asignatura 3: ");
        int nota3 = scanner.nextInt();

        String resultado = (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10)
                ? "value no válido"
                : (nota1 >= 5 && nota2 >= 5 && nota3 >= 5)
                ? "Aprueba"
                : "Repite";

        System.out.println(resultado);

        scanner.close();
    }

}
