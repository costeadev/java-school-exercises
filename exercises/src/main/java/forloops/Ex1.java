package forloops;

/*
 * Después de ejecutar el siguiente fragmento de programa
 * ¿cuál será el valor final de la variable x?
 */

public class Ex1 {
    public static void main(String[] args) {
        int x = 0;
        int n = 16;
        while (n % 2 == 0) {
            x = x + n;
            n = n / 2;
        }
        System.out.println(x);
    }
}
