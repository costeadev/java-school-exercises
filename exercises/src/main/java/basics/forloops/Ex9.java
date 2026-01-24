package basics.forloops;

import java.util.Scanner;

/*
 * Programa que lea dos números:
 * a y b de tipo int. 
 * El programa debe calcular a^b. 
 */

public class Ex9 {
  public static void main(String[] args) {
	  // Entrada de usuario
	  Scanner scan = new Scanner(System.in);
	  
	  // Pedir un int 'base'
	  int base;
	  do { // Bucle hasta que la base introducida sea positiva
	      System.out.print("Introduce una base: ");
	      base = scan.nextInt();
	  } while (base < 0);

	  // Pedir un int 'exponente'
	  int exponente;
	  do { // Bucle hasta que el exponente introducido sea positivo
	      System.out.print("Introduce un exponente: ");
	      exponente = scan.nextInt();
	  } while (exponente < 0);
	  
	  scan.close();
	  
	  // Calcular potencia
	  int total = 1; 
	  for (int i = 1; i <= exponente; i++) {
	    total *= base; 
	  }
	  System.out.printf("%d^%d = %d", base, exponente, total);

  }
}
