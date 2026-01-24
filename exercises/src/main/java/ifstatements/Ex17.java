package ifstatements;

import java.util.Scanner;

/*
 * Recibe 4 char y comprueba que ha recibido, en orden ‘g’ ‘a’ ‘t’ ‘o’. 
 */

public class Ex17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("--- COMPROBAR QUE SE HAYA INTRODUCIDO 'g' 'a' 't' 'o' ---");
		
		System.out.print("Carácter 1: ");
		char char1 = scan.next().charAt(0);

		System.out.print("Carácter 2: ");
		char char2 = scan.next().charAt(0);

		System.out.print("Carácter 3: ");
		char char3 = scan.next().charAt(0);

		System.out.print("Carácter 4: ");
		char char4 = scan.next().charAt(0);
		
		if (char1 == 'g' && char2 == 'a' && char3 == 't' && char4 == 'o') {
			System.out.printf("La palabra es '%c%c%c%c', está correcto", char1, char2, char3, char4);
		} else if (char1 == 'G' && char2 == 'A' && char3 == 'T' && char4 == 'O') {
			System.out.printf("La palabra es '%c%c%c%c', está correcto pero en mayúsculas lol", char1, char2, char3, char4);
		} else {
			System.out.printf("La palabra es '%c%c%c%c', NO está correcto", char1, char2, char3, char4);
		}

		scan.close();
	}
}
