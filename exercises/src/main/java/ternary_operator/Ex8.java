package ternary_operator;

import java.util.Scanner;

/*
 * Crea un programa que lea por teclado
 * una variable entera para representar 
 * la cantidad de horas trabajadas en una semana.
 * Luego, declara una variable double para representar
 *  la tarifa por hora. 
 *  Calcula y muestra el salario semanal.
 */

public class Ex8 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce horas trabajadas esta semana: ");
		int horasTrabajadas = scan.nextInt();
		
		System.out.print("Introduce tarifa por hora: ");
		double tarifaPorHora = scan.nextDouble();
		
		scan.close();
		
		double salarioSemanal = horasTrabajadas * tarifaPorHora;
		System.out.printf("Te corresponden %.2f€ esta semana.", salarioSemanal);
	}
}
