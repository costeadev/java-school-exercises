package if_statements;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int num1 = scan.nextInt();
		
		System.out.print("Introduce otro número: ");
		int num2 = scan.nextInt();
		
		scan.close();
		
		if (num1 == 0 || num2 == 0) {
			System.out.println("No se puede dividir por cero lol.");
			return;
		}
		
		if (num1 % num2 == 0) {
			System.out.printf("\n%d es múltiplo de %d",num1,num2);
		} else if (num2 % num1 == 0) {
			System.out.printf("\n%d es múltiplo de %d",num2,num1);
		} else {
			System.out.println("Ninguno es múltiplo del otro.");
		}
	}
}
