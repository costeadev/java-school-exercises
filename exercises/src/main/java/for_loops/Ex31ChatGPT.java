package for_loops;

public class Ex31ChatGPT {
    public static void main(String[] args) {
        int limite = 15;
        int width = 4; // width for each cell

        // Print header
        System.out.printf("%" + width + "s", ""); // empty corner
        for (int j = 1; j <= 10; j++) {
            System.out.printf("%" + width + "d", j);
        }
        System.out.println(); // newline

        // Print table
        for (int i = 1; i <= limite; i++) {
            System.out.printf("%" + width + "d", i); // row label
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%" + width + "d", i * j); // cell
            }
            System.out.println(); // end of row
        }
    }
}
