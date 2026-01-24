package forloops;

import java.util.Scanner;

/* Programa que lea un número natural y diga si es o no es triangular
 * Un número es triangular si es la suma de los primeros M números naturales para algún valor de M.
 * Ejemplo: 6 es triangular pues 6 = 1 + 2 + 3. 
 */
public class Ex25 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("Introduce un número: ");
			n = scan.nextInt();
			if (n < 1) {System.err.println("El número debe ser mayor que 0.");}
		} while (n < 1);
		
		scan.close();
		
		int suma = 0;
		for (int i = 1; suma < n; i++) {
			suma += i;
			System.out.print(i);
			
			if (suma < n) {
				System.out.print(" + ");
			}
		}
		System.out.printf(" = %d%n", suma);
		System.out.printf("%n%d %s triangular", n, (suma == n) ? "es": "no es");
	}
}
