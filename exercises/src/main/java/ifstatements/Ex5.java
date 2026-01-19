package ifs;

/*
 * Realizar un programa que lea un número entero de tres cifras
 * e indique si se lee igual de izquierda a derecha que de derecha a izquierda. 
 */

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("--- COMPROBAR SI UN NUMERO DE 3 CIFRAS ES CAPICUA ---");
		
		System.out.print("Número de 3 cifras: ");
		int num = scan.nextInt();
		
		boolean validInput = (num >= 100 && num <= 999);
		if (!validInput) {
			System.err.println("ERROR: el número debe tener 3 cifras.");
			return;
		}
		
		int centenas = num / 100;
		int decenas = (num / 10) % 10;
		int unidades = num % 10;
		
		int reversed = unidades * 100 + decenas * 10 + centenas;
		
		if (num == reversed) {
			System.out.printf("%d --> %d%n", num, reversed);
			System.out.printf("%d es capicúa.%n", num);
		} else {
			System.out.printf("%d --> %d%n", num, reversed);
			System.out.printf("%d no es capicúa.%n", num);
		}

		scan.close();
	}
}
