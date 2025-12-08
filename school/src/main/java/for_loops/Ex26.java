package for_loops;

/*
 * Programa que muestre los 50 primeros números de la serie de Fibonacci 0, 1, 1, 2, 3, 5, 8, 13, 21,…
 * Los primeros términos son 0 y 1, los siguientes la suma de los dos anteriores. 
 */

public class Ex26 {
	public static void main(String[] args) {
		
		// Asignación valores iniciales
		long a = 0, b = 1;
		
		// Imprimir los primeros 2 términos
		System.out.println(a); //-> 0
		System.out.println(b); //-> 1
		
		// Imprimir los siguientes términos
		for (int i = 3; i <= 50; i++) {	
			
			long next = a + b;
			System.out.println(next); // Imprimir suma de (a + b)
			
			// Actualizar valores
			a = b; 
			b = next; 
		}
	}
}
