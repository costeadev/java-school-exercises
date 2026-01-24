package forloops;

/*
 * Realizar un programa que muestre por pantalla
 * los números del 1 al 100 
 * sin mostrar los múltiplos de 5.  
 */

public class Ex3 {
  public static void main(String[] args) {
	  // 1 al 100, sin multiplos de 5
	  for(int i = 1; i <= 100; i++) {
		  if (i % 5 != 0) { // Imprime todo menos multiplos de 5
			  System.out.println(i);
		  }
	  }
  }
}
