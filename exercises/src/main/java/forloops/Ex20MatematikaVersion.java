package for_loops;

import java.util.Scanner;

/*
 * Programa que dado un número entero,
 * muestre en líneas consecutivas cada una de sus cifras.
 */

public class Ex20MatematikaVersion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduzca el número: ");
		int num = Math.abs(scan.nextInt());
		int divisor = 1;
		
		scan.close();
		
		while (num / divisor >= 10) divisor *= 10;
		
		while (divisor > 0) {
			System.out.println(num / divisor);
			num %= divisor;
			divisor /= 10;
		}
	}
}
