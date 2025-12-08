package exams;

import java.util.Scanner;

public class ej3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce tamaño de array: ");
		int size = scanner.nextInt();
		
		int[] numbers = new int[size];
		
		// Rellenar array
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("Introduce el numero %d del array: ", i + 1);
			numbers[i] = scanner.nextInt();
		}
		
		int largestPairCount = 0;
		int mostRepeatedNumber = 0;
		for (int i = 0; i < numbers.length - 1; i++) {
			int pairCount = 0;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) pairCount++;
			}
			if (pairCount > largestPairCount) {
				largestPairCount = pairCount + 1;
				mostRepeatedNumber = numbers[i];
			}
		}
		
		// Comprobar si el elemento mas repetido es mayoritario
		boolean esMayoritario = largestPairCount > size/2;
		
		// Imprimir todo bonito
		System.out.printf("\nValor mas repetido: %d", mostRepeatedNumber);
		System.out.printf("\nVeces repetido: %d", largestPairCount);
		System.out.printf("\nEs mayoritario?: %s", esMayoritario ? "si" : "no");

        scanner.close();
	}
}
