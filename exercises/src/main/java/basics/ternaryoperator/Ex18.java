package basics.ternaryoperator;

import java.util.Scanner;

/*
 *  Diseña un programa que lea de teclado 
 *  dos variables booleanas para representar 
 *  si un estudiante aprobó dos asignaturas diferentes. 
 *  Luego, muestra en pantalla un mensaje que
    indique si el estudiante aprueba el curso o repite
 */

public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Se ha aprobado la asignatura 1?: ");
        boolean asignatura1Aprobada = scanner.nextBoolean();

        System.out.print("Se ha aprobado la asignatura 2?: ");
        boolean asignatura2Aprobada = scanner.nextBoolean();

        String resultado = (asignatura1Aprobada && asignatura2Aprobada)
                ? "aprueba el curso"
                : "repite el curso";

        System.out.println("El student " + resultado);

        scanner.close();
    }
}
