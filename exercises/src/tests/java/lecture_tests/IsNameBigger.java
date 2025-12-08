package lecture_tests;

import java.util.Scanner;

public class IsNameBigger {
	
	// PROGRAMA QUE SOLICITE UN NOMBRE Y UN NUMERO
	// EL PROGRAMA TIENE QUE MOSTRAR true SI EL NOMBRE
	// TIENE MÁS CARACTERES QUE NÚMERO
	// false EN CASO CONTRARIO
	
	public static void main(String[] args) {
		
		
		// Scan name and number from the user
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un nombre: ");
		String name = scan.nextLine();
		
		System.out.print("\nIntroduce un numero: ");
		int number = scan.nextInt();
		
		scan.close();
		
		// Check is the name length is bigger than number
		boolean isNameBigger = name.length() > number;
		
		// Print out the result :)
		System.out.println("\nTiene el nombre más caracteres que número?: " + isNameBigger);
		
		
	}
}
