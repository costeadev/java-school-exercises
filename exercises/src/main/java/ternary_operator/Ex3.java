package ternary_operator;

import java.util.Scanner;

/*
 * Crea un programa que lea por teclado 
 * una variable booleana para representar
 *  si un estudiante ha aprobado un examen (true si aprobó, false si no). 
 *  Luego, muestra un mensaje en pantalla
 *  que indique “El estudiante ha aprobado?” seguido de true o false.
 */

public class Ex3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ha aprobado el estudiante? ('true' o 'false'): ");
		boolean haAprobado = scan.nextBoolean();
		
		scan.close();
		
		System.out.printf("El estudiante ha aprobado?: %b", haAprobado);
	}
}
