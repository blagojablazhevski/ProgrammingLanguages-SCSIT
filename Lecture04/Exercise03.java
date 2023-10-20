import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		System.out.println("Decimal: " + input);
		System.out.println("Binary: " + Integer.toBinaryString(input));
		System.out.println("Octal: " + Integer.toOctalString(input));
		System.out.println("Hexadecimal: " + Integer.toHexString(input));
	}

}
