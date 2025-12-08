package for_loops;

import java.util.Scanner;

/*
 *
 */

public class Ex29 {
  public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  
	  int n;

	  do {
	      System.out.print("Introduce un número: ");
	      n = scan.nextInt();
	  } while (n < 0);
	  
	  scan.close();
	  
	  for (int i = 1; i <= n; i++) {
		  for (int j = 1; j <= i; j++) {
			  System.out.print(j);
		  }
		  System.out.println("");
	  }

  }
}
