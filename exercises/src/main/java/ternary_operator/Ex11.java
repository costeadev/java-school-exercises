package ternary_operator;

import java.util.Scanner;

/*
 * Diseña un programa que lea por teclado
 * una variable double para representar
 * el radio de un círculo. 
 * Calcula y muestra el área del círculo en pantalla.
 */

public class Ex11 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce el radio del círculo: ");
		double radioCirculo = scan.nextDouble();
		
		scan.close();
		
		double areaCirculo = Math.PI * Math.pow(radioCirculo, 2);
		System.out.printf("El área de un círculo de %.2f cm de radio es %.2f cm2", radioCirculo, areaCirculo);
	}
}
