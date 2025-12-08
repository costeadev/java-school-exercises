package my_tests;

public class DoublePalindrome {
    public static void main(String[] args) {
        for (int i = 10; i < 10000; i++) {
            String number = "" + i;
            String reverseNumber = new StringBuilder(number).reverse().toString();
            boolean numberIsPalindrome = number.equals(reverseNumber);

            String numberTwice = "" + (i * 2);
            String reverseNumberTwice = new StringBuilder(numberTwice).reverse().toString();
            boolean twiceIsPalindrome = numberTwice.equals(reverseNumberTwice);

            if (numberIsPalindrome && twiceIsPalindrome) {
                System.out.printf("%d / %d%n", i, i * 2);
            }
        }
    }
}
