package if_statements;

import java.util.Scanner;

/*
 * Una compañía dedicada al alquiler de coches cobra un monto fijo de 200 euros para los primeros 300 km de recorrido. 
 * Para más de 300 km y hasta 1000 km, cobra un monto adicional de 15 euros por cada kilómetro en exceso sobre 300, además del fijo. 
 * Para más de 1000 km cobra un monto adicional de 10 euros por cada kilómetro en exceso sobre 1000, además del fijo y de la cantidad extra correspondiente por los kilómetros entre 300 y 1000. 
 * Realizar un programa que dada la cantidad de kilómetros muestre la cantidad a pagar. 
 */

public class Ex9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce la cantidad de kilómetros recorridos: ");
		int km = scan.nextInt();
		
		scan.close();
		
		if (km < 0) {
			System.err.println("Error: Valor negativo no válido");
			return;
		}
		
		int finalPrice;
		
		if (km <= 300) {
			finalPrice = 200;
		} else if (km <= 1000) {
			finalPrice = 200 + (km - 300) * 15;
		} else {
			finalPrice = 200 + 700 * 15 + (km - 1000) * 10;
		}
		
		System.out.printf("El precio final es de %d€%n", finalPrice);	
	}
}
