package basics.forloops;

/* Diseñar un programa que muestre el producto
 * de los 10 primeros números impares.
 */

public class Ex10 {
    public static void main(String[] args) {

        int producto = 1;

        // Los 10 primeros números impares
        for (int i = 1; i < 10 * 2; i += 2) producto *= i;

        System.out.println(producto);
    }
}   