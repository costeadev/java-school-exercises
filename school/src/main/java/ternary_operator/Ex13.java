package ternary_operator;

import java.util.Scanner;

/*
 * Diseña un programa que lea por teclado 
 * dos variables enteras 
 * y muestre en pantalla 
 * el valor de la variable con el mayor número.
 */

public class Ex13 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int num1 = scan.nextInt();
		
		System.out.print("Introduce otro número: ");
		int num2 = scan.nextInt();
		
		scan.close();
		
		String numMayor = num1 == num2 ? "Ninguno, son iguales xd" : num1 > num2 ? ""+num1 : ""+num2;
		System.out.printf("El número mayor es: %s", numMayor);
	}
}
