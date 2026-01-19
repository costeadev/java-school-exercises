package ternary_operator;

import java.util.Scanner;

/*
 * Diseña un programa que lea por teclado
 * una variable entera para representar
 * la temperatura en grados Celsius. 
 * Convierte esta temperatura a grados Fahrenheit 
 * utilizando la fórmula: 
 * Fahrenheit = (Celsius * 9/5) + 32, 
 * y muestra el resultado.
 */

public class Ex9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("--- CONVERTIR CELSIUS A FAHRENHEIT ---");
		
		System.out.print("Temperatura en Celsius (ºC): ");
		int tempCelsius = scan.nextInt();
		
		double tempFahrenheit = celsiusToFahrenheit(tempCelsius);
		System.out.printf("%dºC = %.2fºF", tempCelsius, tempFahrenheit);

		scan.close();
	}

	public static double celsiusToFahrenheit(int tempCelsius) {
		return (tempCelsius * 9.0 / 5) + 32;
	}
}
