package lecture_tests;

import java.util.Scanner;

public class AreNumbersEqual {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int num1 = scan.nextInt();
		if (num1 < 0) System.out.println("El número es negativo");
		
		System.out.print("\nIntroduce otro número: ");
		int num2 = scan.nextInt();
		if (num2 < 0) System.out.println("El número es negativo");
		
		scan.close();
		
		if (num1 == num2) System.out.println("Son iguales");
		if (num1 < num2) System.out.println("" + num1 + " " + num2);
		if (num1 > num2) System.out.println("" + num2 + " " + num1);
	}
}
