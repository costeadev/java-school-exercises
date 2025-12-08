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
		
		System.out.print("Introduce temperatura en grados Celsius (ºC): ");
		int temperaturaCelsius = scan.nextInt();
		
		scan.close();
		
		int temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;
		System.out.printf("%dºC = %dºF", temperaturaCelsius, temperaturaFahrenheit);
	}
}
