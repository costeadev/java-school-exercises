package if_statements;

import java.util.Scanner;

/*
 * Lo mismo que el ejercicio 6, usando un algoritmo distinto
 */

public class Ex18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un solo carácter: ");
		String input1 = scan.next();
		char char1 = input1.charAt(0);
		
		System.out.print("Introduce un solo carácter: ");
		String input2 = scan.next();
		char char2 = input2.charAt(0);
		
		System.out.print("Introduce un solo carácter: ");
		String input3 = scan.next();
		char char3 = input3.charAt(0);
		
		System.out.print("Introduce un solo carácter: ");
		String input4 = scan.next();
		char char4 = input4.charAt(0);
		
		scan.close();

		String word = "" + char1 + char2 + char3 + char4;
		
		if (word.equals("gato")) {
			System.out.printf("La palabra es '%s', está correcto", word);
		} else {
			System.out.printf("La palabra es '%s', NO está correcto", word);
		}
	}
}
