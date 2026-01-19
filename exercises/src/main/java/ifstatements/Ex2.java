package ifs;

import java.util.Scanner;

/*
 * Realizar un programa que lea un año e indique si es o no bisiesto.
 */

public class Ex2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("--- COMPROBAR SI UN AÑO ES BISIESTO ---");
		
		System.out.print("Año: ");
		int year =  scan.nextInt();
		
		boolean validInput = (year >= 1 && year <= 10000);
		boolean isLeap = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
		
		if (!validInput) {
			System.err.println("Error: Valor no válido (1-10000)");
			return;
		}	
		
		if (isLeap) {
			System.out.printf("El año %d es bisiesto", year);
		} else {
			System.out.printf("El año %d no es bisiesto", year);
		}

		scan.close();
	 }
}
