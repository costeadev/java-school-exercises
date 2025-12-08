package lecture_tests;

public class Variables {
	public static void main(String[] args) {
		
		// Printeamos la linea
		System.out.println("Hola, empezando a programar");
		
		// Declaro la variable edad pero sin valor
		int edad;
		
		// Añadimos valor a 'edad'
		edad = 18;
		System.out.println(edad);
		
		// Mayor y menor numero almacenable en Integer
		System.out.println("int: " + Integer.MAX_VALUE + "/" + Integer.MIN_VALUE);
		
		// Mayor y menor numero almacenable en Long
		System.out.println("Long: " + Long.MAX_VALUE + "/" + Long.MIN_VALUE);
		
		System.out.println("Short: " + Short.MAX_VALUE + "/" + Short.MIN_VALUE);
		
		
		
		long G = 25;
		
		System.out.println(G);
		
		long edadTocha;
		edadTocha = 2147483648L; // La L se añade para especificar que se necesita escribir ese número con 64 bits
		
        int edad1 = 75;
        
		edadTocha = edad1;
		
		edad1 = 45;
		
		System.out.println("edad: " + edad1);
		
		System.out.println("edadTocha: " + edadTocha);
		
		
		// para almacenar un solo carácter, usa 2 Bytes (16 bits)
	
		char letraA = 65;
		
		System.out.println("letraA: " + letraA);
		
		letraA = 'G';
		
		System.out.println("letraA: " + letraA);
		
		// otro ejemplo:
		// asigno un primer valor en la declaración de la variable
		
		int n = 80;
		
		char caracter = 'J';
		
		// Esta asignación no nos deja por que 'n' puede ser demasiado grande
		// caracter = n;
		
		n = caracter; // Esto si es posible
		
		System.out.println(caracter);
		System.out.println(n);
		
		// Asignar por operación o expresión
		
		int Num1 = 2;
		int Num2 = Num1 + 7;
		
		System.out.println(Num2);
		
		char letra = 'z';
		
		// restamos 32 para cambiar de minúsculas a meyúsculas segun la tabla ASCII
		
		char letraM = (char)(letra - 32);
		
		System.out.println(letraM);
		
		
		// Imprime una tabla de ASCII

		for (int i = 0; i <= 90; i++) {
			char asciiChar = (char) i; // Convertimos i (int) en asciiChar (char)
			System.out.println(i + " = " + asciiChar);
		}
		
		// METODO 1 (Formal)
		int num = 65;
		System.out.println(num + num);
		char charNum = (char) num;
		String stringNum = String.valueOf(charNum);
		System.out.println(stringNum + stringNum);
		
		// METODO 2 (Clandestino af)
		int num2 = 65;
		System.out.println(num2 + num2);
		char charNum2 = (char) num2;
		System.out.println(""+ charNum2 + charNum2);
		
	}
}
