package lecture_tests;

public class CountTest {
	
	public static void main(String[] args) {
		
/*
 * 		// Leemos por teclado totalUsuarios y nuevosUsuarios
		Scanner scan = new Scanner(System.in);
		
		double num = 7.2 % 2.5;
		
		System.out.println(num);
		
		System.out.print("\nIntroduzca número de usuarios totales: ");
		int totalUsuarios = scan.nextInt();
		
		System.out.print("Introduzca número de usuarios nuevos: ");
		int nuevosUsuarios = scan.nextInt();
		
		scan.close();
		
		
		// Sumar nuevosUsuarios a totalUsuarios
		totalUsuarios = totalUsuarios + nuevosUsuarios; // Método 1
		totalUsuarios += nuevosUsuarios; // Método 2
		totalUsuarios -= nuevosUsuarios; // Se puede hacer con cualquier otro operador 

		System.out.println("\nEl nuevo total de usuarios será: " + totalUsuarios);
		
		// Operador + con String
		String nombre1 = "Jose ";
		String nombre2 = "María ";
		
		String nombre3 = nombre1 + nombre2; // Concatenamos los nombres
		System.out.println("\n" + nombre3);
		
		// También funciona entre STRING y otro tipo
		nombre1 = nombre1 + num;
		System.out.println(nombre1);
		
		
		// Sumar +1 a un contador
		int contador = 0;
		
		contador = contador + 1; // Método 1
		contador += 1; // Método 2
		contador++; // Método 3
		*/
		
		int contador = 0;
		System.out.println("Contador: " + contador);
		
		int numero1 = contador++ + 3; // contador++ + 3  PRIMERO SUMA Y LUEGO INCREMENTA
		System.out.println("\nNumero 1: " + numero1);
		System.out.println("Contador: " + contador);
		
		int numero2 = ++contador + 3; // ++contador + 3  PRIMERO INCREMENTA Y LUEGO SUMA
		System.out.println("\nNumero 2: " + numero2);
		System.out.println("Contador: " + contador);
		
		int a = 5, b = 8, c = 12, d = 3;
		System.out.println(++a + b-- - --c + d++ * a-- - ++b + c++ / --d);
		
		
	}
}
