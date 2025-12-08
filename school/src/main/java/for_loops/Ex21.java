package for_loops;

public class Ex21 {
	
	// Devolver si un numero es primo o no
	public static Boolean esPrimo(int num) {
		
		boolean esPrimo = true; // Inicializar 'esPrimo' como true
		if (num < 2) return false; // Si 'num' es 0, 1 o negativo. No es primo.
		if (num % 2 == 0) return false; // Si 'num' es divisible entre 2. No es primo.
		if (num == 2) return true; // Excepto si es 2.
		
		// Iterar sobre todos los divisores desde 3 hasta la raiz cuadrada de 'num' de 2 en 2.
		int raiz = (int) Math.sqrt(num);
		for (int i = 3; i <= raiz; i += 2) {
			if (num % i == 0) return false; 	// Si 'num' es divisible por algo que no sea él mismo, no es primo.
		}
		
		return true;
	}
	
	
	// MAIN
	public static void main(String[] args) {
		// Iterar sobre cada número y mostrar si es primo o no
		for (int i = 0; i <= 121; i++) {
			System.out.printf("%d = %s\n", i, esPrimo(i) ? "primo" : "...");
		}
	}
}
