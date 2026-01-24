package forloops;

/*
 * Pide un número N. 
 * Imprime en pantalla una tabla de multiplicar de los primeros N números.
 */

public class Ex31 {
	public static void main(String[] args) {
		int limite = 15;
		
		// Print header
		System.out.print("    ");
		for (int i = 1; i <= 10; i++) {
			System.out.printf("   %d", i);
		}
		System.out.println();

		// Print table
		for (int i = 1; i <= limite; i++) {
			System.out.printf("   %d", i);
			for (int j = 1; j <= 10; j++) {
				System.out.printf("   %d", i * j);
			}
			System.out.println();
		}
	}
}
