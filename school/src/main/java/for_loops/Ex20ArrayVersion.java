package for_loops;

public class Ex20ArrayVersion {
	public static void main(String[] args) {
		
		int num = 4752;
		
		int temp = num; // Copy value of num
		int digits = 0;
		
		// Count how many digits 'num' has
		while (temp > 0) {
			temp /= 10;
			digits++;
		}
		
		// Create an int array with size 'digits'
		int[] numArray = new int[digits];
		
		// Extract digits from 'num' right to left. And add them in reverse to the array
        for (int i = digits - 1; i >= 0; i--) {
            numArray[i] = num % 10;
            num /= 10;
        }

        // Print every digit in 'numArray[]'
		for (int digit : numArray) {
			System.out.print(digit);
		}
		
	}
}
