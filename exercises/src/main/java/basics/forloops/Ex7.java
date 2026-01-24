package basics.forloops;

/*
 * Programa que sume el número 5
 * y sus múltiplos desde el 1 hasta el 100
 * y muestre el resultado por pantalla. 
 */

public class Ex7 {
  public static void main(String[] args) {

	  int total = 0; // Acumulador para el total
	  
	  // Del 1 al 100
	  for (int i = 1; i < 100; i++) {
	    if (i % 5 == 0) { // Si es multiplo de 5, se suma al total.
	    	total += i;
	    }  
	  }
	  System.out.printf("El resultado es: %d", total);
  }
}
