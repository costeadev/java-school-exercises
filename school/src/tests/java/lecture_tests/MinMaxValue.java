package lecture_tests;

import java.util.Locale;
import java.util.Scanner;

public class MinMaxValue {
	public static void main(String[] args) {
		// float: 32 bits
		// double: 64 bits
		
		System.out.println("Float MAX_VALUE: " + Float.MAX_VALUE);
		System.out.println("Float MIN_VALUE: " + Float.MIN_VALUE);
		System.out.println("Double MAX_VALUE: " + Double.MAX_VALUE);
		System.out.println("Double MIN_VALUE: " + Double.MIN_VALUE);
		
		double num3 = 1.0 / 3.0;
		System.out.println(num3);
		
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US); // Cambiar el locale que usa el Scanner
		
		System.out.print("Mete un decimal para variable double: ");
		double num5 = scanner.nextDouble();
		System.out.println(num5);
		
		scanner.close();
	}
}
