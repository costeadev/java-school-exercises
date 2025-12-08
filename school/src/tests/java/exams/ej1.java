package exams;

import java.util.Scanner;

public class ej1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Leer numero hasta que sea mayor que 1
		int n;
		do {
			System.out.print("Introduce un numero: ");
			n = scanner.nextInt();
		} while (n < 1);
			
		scanner.close();
		
		
		boolean esPar = n % 2 == 0;
		int collatzCount = 0;
		int valorPico = Integer.MIN_VALUE;
		
		// Secuencia de Collatz
		while (n > 1) {
		
			if (esPar) {
				n /= 2;
			}
			else if (!esPar) {
				n *= 3;
				n += 1;
			}
			// Calcular valor pico
			if (n > valorPico) valorPico = n;
			
			// Contar todos los digitos de Collatz
			collatzCount++;
			
			// Imprimir cada digito
			System.out.printf("%d ", n);
		}
		
		// Imprimir los demas valores
		System.out.printf("\nDigitos de Collatz: %d", collatzCount);
		System.out.printf("\nValor pico: %d", valorPico);
	}
}
