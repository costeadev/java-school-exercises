package forloops;

public class Ex30SideBChatGPT {
	public static void main(String[] args) {
		int rows = 3;
		
		int height = rows * 2 - 1; // Total height of the inverted pyramid
		for (int i = 1; i <= height; i++) { 
			int level = i <= rows ? i : (rows * 2 - i);
			int spaces = rows - level;
			int stars = level * 2 - 1;
			
			// Print spaces
			for (int j = 0; j < spaces; j++) System.out.print(" ");
			// Print stars
			for (int j = 0; j < stars; j++) System.out.print("*");
			
			System.out.println();
		}
	}
}
