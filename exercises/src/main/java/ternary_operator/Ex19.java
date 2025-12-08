package ternary_operator;

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
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nota asignatura 1: ");
		int notaAsignatura1 = scan.nextInt();
		
		System.out.print("Nota asignatura 2: ");
		int notaAsignatura2 = scan.nextInt();
		
		System.out.print("Nota asignatura 3: ");
		int notaAsignatura3 = scan.nextInt();
		
		
		scan.close();
		
		boolean valorNoValido = notaAsignatura1 < 0 || notaAsignatura1 > 10 | notaAsignatura2 < 0 || notaAsignatura2 > 10 | notaAsignatura3 < 0 || notaAsignatura3 > 10; 
		String apruebaORepite = valorNoValido ? "Valor no válido introducido, deben ser números enteros entre 0 y 10" : notaAsignatura1 >= 5 && notaAsignatura2 >=5 && notaAsignatura3 >=5 ? "El estudiante aprueba el curso" : "El estudiante repite curso";
		System.out.printf(apruebaORepite);
	}
}
