package if_statements;

import java.util.Scanner;

/*
 * Recibe 4 char y comprueba que ha recibido, en orden ‘g’ ‘a’ ‘t’ ‘o’. 
 */

public class Ex17 {
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
		
		if (char1 == 'g' && char2 == 'a' && char3 == 't' && char4 == 'o') {
			System.out.printf("La palabra es '%c%c%c%c', está correcto", char1, char2, char3, char4);
		} else if (char1 == 'G' && char2 == 'A' && char3 == 'T' && char4 == 'O') {
			System.out.printf("La palabra es '%c%c%c%c', está correcto pero en mayúsculas lol", char1, char2, char3, char4);
		} else {
			System.out.printf("La palabra es '%c%c%c%c', NO está correcto", char1, char2, char3, char4);
		}
	}
}
