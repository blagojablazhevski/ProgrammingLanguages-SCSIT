import java.lang.Math;

public class Exercise01 {

	public static void main(String[] args) {
		float rand = (float) Math.random() * 100;
		float decimalRand = rand - (int)rand;
		
		
		System.out.println("From 0...100, the computer picked " + rand);
		System.out.println("Integer part of this number is: " + (int)rand);
		System.out.println("Decimal part of this number is: " + decimalRand);
		System.out.println("Character with code " + (int)rand + " is: " + (char)((int)rand));

	}

}
