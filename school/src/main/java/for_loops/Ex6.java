package for_loops;

import java.util.Scanner;

/*
 * Programa que lea un número N mayor que 0
 * y calcule la siguiente suma: 1+2+3+...+N.
 */

public class Ex6 {
  public static void main(String[] args) {
	  
	  // Entrada de usuario
	  Scanner scan = new Scanner(System.in);
	  
	  // Pedir 'n' hasta que sea positivo
	  int n;
	  do {
	      System.out.print("Introduce un número: ");
	      n = scan.nextInt();
	  } while (n < 0);
	  
	  scan.close();

	  
	  int sumaTotal = 0; // Acumulador para la suma total
	  // Sumar los numeros desde 1 hasta N
	  for (int i = 1; i <= n; i++) {
	    sumaTotal += i;  
	  }
	  System.out.println(sumaTotal);
  }
}
