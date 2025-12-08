package my_tests;

import java.util.Scanner;

public class NameToASCII {
	
	public static int asciiNameConverter(String name) {
		
		int asciiSum = 0;
		for (int i = 0; i < name.length(); i++) {
			asciiSum += name.charAt(i);
		}
		
		return asciiSum;
	}
	
	
	public static void main(String[] args) {

		// MENU
		System.out.println("Convierte tu nombre en carácter ASCII");
		
		// RETRIEVE NAME
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Como te llamas?: ");
		String name = scan.nextLine();
		
		scan.close();
		
		// GET SUM
		int asciiSum = asciiNameConverter(name);
		
		// PRINT EACH CHARACTER AND ITS ASCII
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i) + " = " + (int) name.charAt(i));
		}
		

		System.out.println(name + " = " + (char) asciiSum + " = " + (int) asciiSum);
		
	}
}
