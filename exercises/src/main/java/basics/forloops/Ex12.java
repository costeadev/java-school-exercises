package basics.forloops;

import java.util.Scanner;

/*
 * Pedir 10 números. 
 * Mostrar:
 * - La media de los números positivos,
 * - La media de los números negativos 
 * - La cantidad de ceros.
 */
public class Ex12 {
	
	public static void main(String[] args) {
		
		// Entrada de usuario
		Scanner scan = new Scanner(System.in);
		
		// Variables y acumuladores
		int cantidadPositivos = 0, cantidadNegativos = 0, cantidadCeros = 0;
		double totalPositivos = 0, totalNegativos = 0;
		
		// Bucle para leer 10 números
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Introduce el número en la posición %d: ", i);
			int n = scan.nextInt();
			
			// Clasificar 'n' según su signo
			if (n > 0) { 
				totalPositivos += n;
				cantidadPositivos++;
			}
			else if (n < 0) {
				totalNegativos += n;
				cantidadNegativos++;
			}
			else cantidadCeros++;
		}
		
		scan.close();
		
		// Calcular e imprimir las medias, controlando divisiones por cero
		System.out.printf("Media positivos: %.2f%n", (cantidadPositivos == 0) ? 0 : totalPositivos/cantidadPositivos);
		System.out.printf("Media negativos: %.2f%n", (cantidadNegativos == 0) ? 0 : totalNegativos/cantidadNegativos);
		System.out.printf("Cantidad ceros: %d%n", cantidadCeros);
	}
}   