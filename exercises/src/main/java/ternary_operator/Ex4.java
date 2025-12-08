package ternary_operator;

import java.util.Scanner;

/*
 * Diseña un programa que lea por teclado
 *  una variable entera para representar
 *   la edad de un usuario. 
 *   Luego, muestra un mensaje que diga "Eres mayor de edad:” 
 *   seguido de true si es verdad o false si no lo es.
 */

public class Ex4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce tu edad: ");
		int edadUsuario = scan.nextInt();
		
		scan.close();
		
		boolean mayorDeEdad = (edadUsuario >= 18);
		System.out.printf("Eres mayor de edad: %b", mayorDeEdad);
	}
}
