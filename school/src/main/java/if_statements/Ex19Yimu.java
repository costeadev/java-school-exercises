package if_statements;

import java.util.Scanner;

public class Ex19Yimu {

	public static void main(String [] args) {

		Scanner KB = new Scanner(System.in);
	
		System.out.println("Introduce la 1ª minuscula");
		char first = KB.nextLine().charAt(0);
		System.out.println("Introduce la 2ª minuscula");
		char second = KB.nextLine().charAt(0);
		System.out.println("Introduce la 3ª minuscula");
		char third = KB.nextLine().charAt(0);
		
		System.out.println("Ahora itroduce las veces que quieres desplazarlos en el alfabeto");
		int t = KB.nextInt();
		
		char c1 = (char)(t + first);
		char c2 = (char)(t + second);
		char c3 = (char)(t + third);
		
		char r1 = (char) (t - (122 - first) + 96);
		char r2 = (char) (t - (122 - second) + 96);
		char r3 = (char) (t - (122 - third) + 96);
		
		String result = "";
		
		if(t > 26) {
			System.err.println("Necesitas meter un numero mas pequeño");
		} else if ((first < 97 || first > 122) || (second < 97 || second > 122) || (third < 97 || third > 122)) 
			System.err.println("Una de las letras no es minuscula / no es una letra");
		
		else if(c1 > 122 && c2 > 122 && c3 > 122)
			result = r1 + " " + r2 + " " + r3;
			
		else if (c1 > 122) {
			
			if(c2 > 122) {
					result = r1 + " " + r2 + " " + c3;
			}
			else if (c3 > 122) 
				result = r1 + " " + c2 + " " + r3;
			else
				result = r1 + " " + c2 + " " + c3;
		
		}else if (c2 > 122) {
			
			if(c3 > 122) 
				result = c1 + " " + r2 + " " + r3;
			else
				result = c1 + " " + r2 + " " + c3;
		
		}else if (c3 > 122)
			result = c1 + " " + c2 + " " + r3;
		
		else
			result = c1 + " " + c2 + " " + c3;
		
		System.out.println(result);
	}
}
