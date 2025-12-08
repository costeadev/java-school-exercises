package for_loops;

import java.util.Scanner;

/*
 * Implementa un programa que tome una cadena con espacios 
 * y devuelva la misma cadena sin espacios 
 */

public class Ex37 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Pedir palabra al usuario 
		System.out.print("Introduce una palabra: ");
		String word = scan.nextLine();
		
		scan.close();
		

		String formattedWord = ""; // Nuevo string para guardar 'word' sin espacios
		
		// Recorrer cada char de la palabra
		for (int i = 0 ; i < word.length(); i++) {
			char c = word.charAt(i);
			if (c != ' ') formattedWord += c; // Añadir al nuevo string solo los caracteres que no sean espacios
		}
		System.out.println(formattedWord);


	}
}
