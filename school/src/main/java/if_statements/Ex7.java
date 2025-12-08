package if_statements;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int num1 = scan.nextInt();
		
		System.out.print("Introduce otro número: ");
		int num2 = scan.nextInt();
		
		System.out.print("Introduce OTRO número: ");
		int num3 = scan.nextInt();
		
		scan.close();
		
		int bigger = num1;
		
		if (num2 > bigger) bigger = num2;
		if (num3 > bigger) bigger = num3;
		
		System.out.printf("El mayor es %d", bigger);
	}
}
