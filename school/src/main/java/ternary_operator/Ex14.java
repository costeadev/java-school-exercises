package ternary_operator;

import java.util.Scanner;

/*
 * Escribe un programa que lea por teclado 
 * una variable de tipo entero 
 * y diga si ese número es par o impar
 */

public class Ex14 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un numerín: ");
		int num = scan.nextInt();
		
		scan.close();
		
		String parImpar = num % 2 == 0 ? "par" : "impar";
		System.out.printf("%d es %s", num, parImpar);
	}
}
