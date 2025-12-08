package my_tests;

public class BinaryToDecimal {
	public static char binaryToDecimal(String num) {
		char ans = (char)Integer.parseInt(num, 2);
		return ans;
	}
	public static void main(String[] args) {
		
		// DECIMAL
		System.out.println(""+(char)68 + (char)105 + (char)101 + (char)103 + (char)111);
        
        // BINARIO
        System.out.println(""+ 
        				   binaryToDecimal("1000100") +
        				   binaryToDecimal("1101001") +
        				   binaryToDecimal("1100101") +
        				   binaryToDecimal("1100111") +
        				   binaryToDecimal("1101111"));
	}
}
