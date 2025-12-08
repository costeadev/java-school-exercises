package ternary_operator;

import java.util.Scanner;

/*
 * Escribe un programa que lea por teclado
 * tres variables enteras y muestre en pantalla la suma de dichos números,
 * pero si la suma es mayor que 100,
 * muestra un mensaje indicando que es demasiado grande
 */

public class Ex17 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un numérin: ");
		int num1 = scan.nextInt();
		
		System.out.print("Introduce otro numérin: ");
		int num2 = scan.nextInt();
		
		System.out.print("Introduce OTRO numérin: ");
		int num3 = scan.nextInt();
		
		scan.close();
		
		int suma = num1 + num2 + num3;
		String sumaDemasiadoGrande = suma > 100 ? "Oh lawd he big" : "He built smol";
		
		System.out.printf(sumaDemasiadoGrande);
	}
}
