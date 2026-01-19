package ternary_operator;

import java.util.Scanner;

/*
 * Escribe un programa que lea por teclado 
 * dos variables enteras para representar 
 * la distancia en kilómetros y el tiempo en horas. 
 * Calcula y muestra la velocidad promedio en kilómetros por hora.

 */

public class Ex10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("--- CALCULAR KILOMETROS HORA ---");
		
		System.out.print("Distancia (km): ");
		int distancia = scan.nextInt();
		
		System.out.print("Tiempo (horas): ");
		int tiempo = scan.nextInt();
		
		scan.close();
		
		int velocidad = calcularVelocidad(distancia, tiempo);
		System.out.printf(
			"Para recorrer %d km en %d horas es necesario ir a %d km/h",
			distancia, tiempo, velocidad
		);
	}

	public static int calcularVelocidad(int distancia, int tiempo) {
		return distancia / tiempo;
	}
}
