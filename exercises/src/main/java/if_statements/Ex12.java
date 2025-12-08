package if_statements;

import java.util.Scanner;

/*
 * Recibir 4 números e indicar si son todos el mismo número. 
 */

public class Ex12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int num1 = scan.nextInt();
		
		System.out.print("Introduce otro número: ");
		int num2 = scan.nextInt();
		
		System.out.print("Introduce OTRO número: ");
		int num3 = scan.nextInt();
		
		System.out.print("Introduce OTRO número más: ");
		int num4 = scan.nextInt();
		
		scan.close();
		
		
		if (num1 == num2 && num1 == num3 && num1 == num4) {
			System.out.printf("%n%d %d %d y %d son todos iguales", num1, num2, num3, num4);
		} else {
			System.out.printf("%n%d %d %d y %d NO son todos iguales", num1, num2, num3, num4);
		}
	}
}
