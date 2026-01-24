import java.util.Scanner;

public class YisusExam1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena del tipo aaaabbbcc. No puedes repetir un caracter que ya se ha usado en un grupo de caracteres previamente");
        String cadena = scanner.nextLine();
        String cadenaNueva = "";
        int i = 0;
        while (i < cadena.length()) {
            int count = 0;
            for (int j = 0; j < cadena.length(); j++) {
                if (cadena.charAt(i) == cadena.charAt(j)) {
                    count++;
                }
            }
            cadenaNueva += "" + cadena.charAt(i) + count;
            i += count;
        }
        System.out.print("El resultado a mostrar es: ");
        if (cadenaNueva.length() > cadena.length()) {
            System.out.println(cadena);
        } else {
            System.out.println(cadenaNueva);
        }
        scanner.close();
    }

}