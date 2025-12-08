package ternary_operator;

import java.util.Scanner;

/*
 * Escribe un programa que lea por teclado 
 * dos variables de tipo double para representar
 * las calificaciones de un estudiante en dos asignaturas. 
 * Muestra en pantalla un mensaje que indique
 * si el estudiante aprobó al menos una de ellas.
 */

public class Ex20 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nota final asignatura 1: ");
		double notaFinalAsignatura1 = scan.nextDouble();
		
		System.out.print("Nota final asignatura 2: ");
		double notaFinalAsignatura2 = scan.nextDouble();
		
		scan.close();
		
		boolean notasValidas = (notaFinalAsignatura1 >= 0 && notaFinalAsignatura1 <= 10) && (notaFinalAsignatura2 >= 0 && notaFinalAsignatura2 <= 10);
		
		String aprobadoAlguna = !notasValidas ?				
				"Notas no válidas" 
				:((notaFinalAsignatura1 >= 5) || (notaFinalAsignatura2 >= 5)) 
				   ? "El estudiante aprobó al menos una asignatura" 
				   : "No aprobó ninguna asignatura";  
		
		System.out.println(aprobadoAlguna);
	}
}
