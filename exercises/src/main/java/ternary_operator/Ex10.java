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
		
		System.out.print("Introduce distancia en km: ");
		int distancia = scan.nextInt();
		
		System.out.print("Introduce tiempo en horas: ");
		int tiempo = scan.nextInt();
		
		scan.close();
		
		int kilometrosHora = distancia / tiempo;
		System.out.printf("Para recorrer %d km en %d horas es necesario ir a %d km/h", distancia, tiempo, kilometrosHora);
	}
}
