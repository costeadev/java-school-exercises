package forloops;

import java.util.Scanner;

/*
 * Dada una palabra, escríbela al revés.
 */

public class Ex34 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Pedir palabra al usuario y eliminar espacios sobrantes
		System.out.print("Introduce una palabra: ");
		String word = scan.nextLine().trim();
		
		scan.close();
		
		// Recorrer cada letra de la palabra
		for (int i = word.length() - 1; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}
	}
}
