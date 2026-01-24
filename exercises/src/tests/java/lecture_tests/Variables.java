package lecture_tests;

public class Variables {
    public static void main(String[] args) {

        System.out.println("Hello, starting to code");

        int age;
        age = 18;

        System.out.println(age);

        // MIN and MAX values storable in an Integer
        System.out.println("int: " + Integer.MAX_VALUE + "/" + Integer.MIN_VALUE);

        // MIN and MAX values storable in a Long
        System.out.println("Long: " + Long.MAX_VALUE + "/" + Long.MIN_VALUE);

        // MIN and MAX values storable in a Short
        System.out.println("Short: " + Short.MAX_VALUE + "/" + Short.MIN_VALUE);

        long g = 25;
        System.out.println(g);

        long longAge;
        longAge = 2147483648L; // L is mandatory to specify the number is 64 bit

        int age1 = 75;
        longAge = age1;
        age1 = 45;

        System.out.println("age: " + age1);
        System.out.println("longAge: " + longAge);

        // To store just one char, 2 bytes are used. (16 bit)

        char a = 65;

        System.out.println("a: " + a);

        a = 'G';

        System.out.println("a: " + a);

        // Another example:
        // Assign a value during variable declaration

        int n = 80;
        char letter = 'J';
        n = letter;

        System.out.println(letter);
        System.out.println(n);

        // Assign operation or expression
        int num1 = 2;
        int num2 = num1 + 7;

        System.out.println(num2);
        char letter2 = 'z';

        // We substract 32 to convert into uppercase according to the ASCII table

        char letterM = (char) (letter2 - 32);

        System.out.println(letterM);


        // Print an ASCII table

        for (int i = 0; i <= 90; i++) {
            char asciiChar = (char) i; // Convert i into ASCII characters
            System.out.println(i + " = " + asciiChar);
        }

        // Method 1 (Formal)
        int number1 = 65;
        System.out.println(number1 + number1);

        char charNum1 = (char) number1;

        String stringNum1 = String.valueOf(charNum1);
        System.out.println(stringNum1 + stringNum1);

        // Method 2 (Ugly af)
        int number2 = 65;
        System.out.println(number2 + number2);

        char charNum2 = (char) number2;

        System.out.println("" + charNum2 + charNum2);

    }
}
