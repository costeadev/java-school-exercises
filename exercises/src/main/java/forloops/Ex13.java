package forloops;

import java.util.Scanner;

/*
 * Programa que pida
 * - La estatura (en metros)
 * - El sexo (V/M) 
 * De un número indeterminado de personas (mientras el operador quiera).
 * Posteriormente imprimirá la estatura media de los varones y la estatura media de las mujeres. 
 */

public class Ex13 {
	public static void main(String[] args) {
		
		// Scanner para entrada de usuario
		Scanner scan = new Scanner(System.in);
		
		// Variables para estatura y sexo
		double estatura;
		char sexo;
		
		// Acumuladores y contadores para cada sexo
		double sumaVarones = 0, sumaMujeres = 0;
		int numVarones = 0, numMujeres = 0;
		
		System.out.println("CALCULAR MEDIA ESTATURA POR SEXO (0 para parar).");
		
		// Loop de entrada
		while (true) {
			
			// Pedir estatura primero para que el usuario pueda salir con '0'
			System.out.print("Introduce la estatura (en metros): ");
			estatura = scan.nextDouble();
			
			// Condición de salida
			if (estatura == 0) break;
			
			// Pedir el sexo
			System.out.print("Introduce el sexo (V/M): ");
			// Convertimos a mayúsculas para aceptar 'v' y 'V'
			sexo = Character.toUpperCase(scan.next().charAt(0));
	
			// Añadir estatura al grupo correct
			if (sexo == 'V') {
				sumaVarones += estatura;
				numVarones++;
			}
			else if (sexo == 'M') {
				sumaMujeres += estatura;
				numMujeres++;
			}
			else {
				System.out.println("Valor no válido. Usa 'V' o 'M' ");
			}
		}

		scan.close();
		
		// Imprimir resultados
		System.out.println("\n--- RESULTADOS ---");
		
		// Evitar dividir entre cero
		if (numVarones > 0) {
			System.out.printf("\nLa media en varones es %.2f", sumaVarones/numVarones);
		} else {
			System.out.println("No se introdujeron varones.");
		}

		if (numMujeres > 0) {
			System.out.printf("\nLa media en mujeres es %.2f", sumaMujeres/numMujeres);
		} else {
			System.out.println("No se introdujeron mujeres.");
		}
	}
}   