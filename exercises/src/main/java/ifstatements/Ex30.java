package ifs;

import java.util.Scanner;

/*
 * Pedir una nota numérica entera entre 0 y 10,
 * y mostrar dicha nota de la forma: cero, uno, dos, tres... 
 */

public class Ex30 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce una nota: ");
		int nota = scan.nextInt();

		if (nota < 0 || nota > 10) {
			System.err.println("Error: Valor no válido");
			return;
		}

		System.out.printf("%d = %s", nota, numberToWord(nota));

		scan.close();
	}
	
	public static String numberToWord(int number) {
		switch(number) {
			case 0 -> {return "cero";}
			case 1 -> {return "uno";}
			case 2 -> {return "dos";}
			case 3 -> {return "tres";}
			case 4 -> {return "cuatro";}
			case 5 -> {return "cinco";}
			case 6 -> {return "seis";}
			case 7 -> {return "siete";}
			case 8 -> {return "ocho";}
			case 9 -> {return "nueve";}
			case 10 -> {return "diez";}
			default -> {return "null";}
		}
	}
}
