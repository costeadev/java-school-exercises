package for_loops;

public class Ex30SideB {
	public static void main(String[] args) {
		int rows = 3;
		int stars = 1;
		
		// Upward pyramid
		for (int i = 1; i <= rows; i++) {
			// Print spaces
			for (int j = 1; j <= (rows - i); j++) {
				System.out.print(" ");
			}	
			// Print stars
			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}
			stars += 2;
			
			System.out.println(); // New line
		}
		
		stars -= 4; 
		
		// Downward pyramid
		for (int i = 1; i <= (rows - 1) ; i++) {
			// Print spaces
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}	
			// Print stars
			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}
			stars -= 2;
					
			System.out.println(); // New line
		}
	}
}
