package basics.ternaryoperator;

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

		System.out.println("--- CALCULAR AREA CIRCULO ---");
		
		System.out.print("Introduce el radio del círculo: ");
		double radio = scan.nextDouble();
		
		double area = calcularAreaCirculo(radio);
		System.out.printf("Area: %.2f cm²", area);

		scan.close();
	}

	public static double calcularAreaCirculo(double radio) {
		return Math.PI * Math.pow(radio, 2);
	}
}
