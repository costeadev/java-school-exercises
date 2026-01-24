package ternaryoperator;

import java.util.Scanner;

/*
 * Escribe un programa que lea por teclado 
 * una variable de tipo entero 
 * y diga si ese número es par o impar
 */

public class Ex14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("--- COMPROBAR SI UN NUMERO ES PAR O IMPAR ---");
		
		System.out.print("Número: ");
		int num = scan.nextInt();

		System.out.printf("%d = %s", num, esPar(num) ? "par" : "impar");

		scan.close();
	}

	public static boolean esPar(int n) {
		return n % 2 == 0;
	}
}
