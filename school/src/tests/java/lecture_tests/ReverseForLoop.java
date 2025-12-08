package lecture_tests;

import java.util.Scanner;

public class ReverseForLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		final int num = scan.nextInt();
		
		scan.close();
		
		for (int i = num; i >= -num; i--) {
			System.out.println(i);
		}
	}
}
