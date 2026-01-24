package forloops;

import java.util.Scanner;

/*
 * Realizar un programa que calcule 
 * y muestre la suma de los múltiplos de 5
 * comprendidos entre dos valores A y B.
 *  El programa no permitirá introducir valores negativos para A y B
 *  y verificará que A es menor que B. 
 *  Si A es mayor que B, intercambiará sus valores. 
 */

public class Ex8 {
  public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  
	  // Pedir 'a' hasta que sea positivo
	  int a;
	  do {
	      System.out.print("Introduce un número: ");
	      a = scan.nextInt();
	  } while (a < 0);

	  
	  // Pedir 'b' hasta que sea positivo
	  int b;
	  do {
	      System.out.print("Introduce otro número: ");
	      b = scan.nextInt();
	  } while (b < 0);
	  
	  scan.close();
	  
	  // Intercambiar los numero si (a > b)
	  if (a > b) {
		  int temp = a;
		  a = b;
		  b = temp;
	  }

	  // Sumar a total los múltiplos de 5
	  int total = 0;
	  for (int i = a; i < b; i++) {
	    if (i % 5 == 0) {
	    	total += i;
	    } 
	  }
	  // Imprimir total
	  System.out.println(total);
  }
}
