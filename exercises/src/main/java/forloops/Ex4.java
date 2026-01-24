package forloops;

/*
 * Programa que cuente 
 * todos los números múltiplos de 7
 * comprendidos entre 1 y 100.
 */

public class Ex4 {
  public static void main(String[] args) {
	  
	  int totalMultiplos7 = 0; // Contador para todos los multiplos de 7
	  for(int i = 1; i <= 100; i++) {
		  if (i % 7 == 0) { // Si es multiplo de 7, aumentamos el contador.
			  System.out.println(i);
			  totalMultiplos7++;
		  }
	  }
	  System.out.printf("Hay un total de %d múltiplos de 7", totalMultiplos7);
  }
}
