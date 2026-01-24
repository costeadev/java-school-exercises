package lecture_tests;

public class CountTest {

    public static void main(String[] args) {
		
/*
		Scanner scanner = new Scanner(System.in);
		
		double num = 7.2 % 2.5;
		
		System.out.println(num);
		
		System.out.print("\Total number of users: ");
		int userTotal = scanner.nextInt();
		
		System.out.print("Introduzca number de usuarios nuevos: ");
		int newUsers = scanner.nextInt();
		
		scanner.close();
		
		
		// Sumar newUsers a userTotal
		userTotal = userTotal + newUsers; // Method 1
		userTotal += newUsers; // Method 2
		userTotal -= newUsers; // You could do it with any operator

		System.out.println("\The new total of users will be: " + userTotal);
		
		// + operator with String
		String name1 = "Jose ";
		String name2 = "María ";
		
		String name3 = name1 + name2; // We concatenate the names
		System.out.println("\n" + name3);
		
		// Also works witth String and other type
		name1 = name1 + num;
		System.out.println(name1);
		
		
		// Add +1 to a count
		int count = 0;
		
		count = count + 1; // Method 1
		count += 1; // Method 2
		count++; // Method 3
		*/

        int count = 0;
        System.out.println("count: " + count);

        int number1 = count++ + 3; // First adds, then increments
        System.out.println("\nNumber 1: " + number1);
        System.out.println("Count: " + count);

        int number2 = ++count + 3; // First increments, then adds
        System.out.println("\nNumber 2: " + number2);
        System.out.println("Count: " + count);

        int a = 5, b = 8, c = 12, d = 3;
        System.out.println(++a + b-- - --c + d++ * a-- - ++b + c++ / --d);
    }
}
