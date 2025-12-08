package lecture_tests;

import java.util.Scanner;

public class IsMultiple {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int num1 = scan.nextInt();
		
		System.out.print("Introduce otro número: ");
		int num2 = scan.nextInt();
		
		scan.close();
		
		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("Son multiplos :D");
		}
		else {
			System.out.println("No son multiplos :/");
		}
		System.out.println("Adios");
	}
}
