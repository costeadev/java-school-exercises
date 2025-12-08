package my_tests;

import java.util.Scanner;

public class ManualAbsoluteOfANumber {
	public static void main(String[] args) {
		// Input
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce numero 1: ");
		double num1 = scan.nextDouble();
		
		System.out.print("Introduce numero 2: ");
		double num2 = scan.nextDouble();
		
		scan.close();
		
		
		double resta = num1 - num2; // 22 - 12 = 10 / 12 - 12 = -10
		
		boolean esPositivo = (resta > 0);
		                                //10    //-10  - -10   - -10
		double resultado = esPositivo ? resta : (resta - resta - resta);
		
		System.out.println(resultado);
	}
}
