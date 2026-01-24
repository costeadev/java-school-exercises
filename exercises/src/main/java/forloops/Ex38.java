package forloops;

/*
 * Concatena dos cadenas de igual longitud de manera alternativa, carácter por carácter.
 * ejemplo: gato casa = gcaatsoa
 */

public class Ex38 {
	public static void main(String[] args) {
		
		// Strings de ejemplo
		String str1 = "fat";
		String str2 = "cat";
		
        // Recorremos cada posición de los strings
        // e imprimimos los caracteres alternando uno de str1 y uno de str2
		for (int i = 0; i < str1.length(); i++) {
			System.out.print(str1.charAt(i));
			System.out.print(str2.charAt(i));
		}
	}
}
