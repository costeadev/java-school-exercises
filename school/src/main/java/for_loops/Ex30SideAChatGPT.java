package for_loops;

public class Ex30SideAChatGPT {
    public static void main(String[] args) {
        int rows = 5; // height of the tree

        for (int i = 1; i <= rows; i++) {
            // print leading spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Optional trunk
        for (int i = 0; i < rows - 2; i++) System.out.print(" ");
        System.out.println("|");
    }
}
 