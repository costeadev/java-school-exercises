package basics.forloops;

import java.util.Scanner;

/*
 * Modificar el programa anterior de forma que
 * cuente todos los números múltiplos de un
 * solicitado previamente por teclado, 
 * comprendidos entre dos números solicitados 
 * también previamente por teclado.
 */

public class Ex5 {
  public static void main(String[] args) {
	  
	  // Entrada de usuario
	  Scanner scan = new Scanner(System.in);
	  
	  System.out.print("Introduce un número: ");
	  int num = scan.nextInt();
	  
	  System.out.print("Introduce un inicio: ");
	  int inicio = scan.nextInt();
	  
	  System.out.print("Introduce un fin: ");
	  int fin = scan.nextInt();
			  
	  scan.close();
	  
	  // Bucle desde 'inicio' hasta 'fin'
	  for (int i = inicio; i <= fin; i++) {
		  if (i % num == 0) { // Si 'i' es multiplo de 'num', lo imprime
			  System.out.println(i);
		  }
	  }
  }
}
