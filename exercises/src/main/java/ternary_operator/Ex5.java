package ternary_operator;

import java.util.Scanner;

/*
 * Escribe un programa que lea por teclado 
 * dos variables enteras para representar
 *  el ancho y la altura de un rectángulo.
 *  Calcula y muestra el área del rectángulo en pantalla.
 */

public class Ex5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("--- CALCULAR AREA RECTANGULO ---");
		
		System.out.print("Ancho del rectángulo: ");
		int ancho = scan.nextInt();
		
		System.out.print("Alto del rectángulo: ");
		int alto = scan.nextInt();
		
		int area = calcularAreaRectangulo(ancho, alto);
		System.out.printf("El área del rectángulo es: %d", area);

		scan.close();
	}

	public static int calcularAreaRectangulo(int ancho, int alto) {
		return ancho * alto;
	}
}
