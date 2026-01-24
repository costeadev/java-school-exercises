package basics.forloops;

public class Ex30SideA {
	public static void main(String[] args) {
		int rows = 5;
		int cols = 1;
		int stars = 1;
		int spaces = 6;
		int space1 = 3;
		int space2 = 3;
		
		// Calculate how many chars each row has
		for (int i = 1; i < rows; i++) {
			cols = i;
		}
		cols += rows;
		
		// Print every row
		for (int i = 1; i <= rows; i++) {
			space1 = spaces/2;
			space2 = space1;
			
			// Space 1
			for (int j = 1; j <= space1; j++) {
				System.out.print(" ");
			}
			// Stars
			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}
			// Space 2
			for (int j = 1; j <= space2; j++) {
				System.out.print(" ");
			}
			stars += 2;
			spaces = cols - stars;
			System.out.println();
		}
		
	}
}
