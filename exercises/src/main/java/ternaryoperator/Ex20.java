package ternaryoperator;

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
		double nota1 = scan.nextDouble();
		
		System.out.print("Nota final asignatura 2: ");
		double nota2 = scan.nextDouble();
		
		String resultado = (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10)
				? "Notas no válidas"
				:(nota1 >= 5 || nota2 >= 5)
				   ? "Aprobó al menos una asignatura"
				   : "No aprobó ninguna asignatura";  
		
		System.out.println(resultado);

		scan.close();
	}
}
