package ass3;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        String text;
        do {
            System.out.print("Enter text (or 'END' to quit): ");
            text = input.nextLine();

            if (!text.equalsIgnoreCase("END")) {
                int length = text.length();
                int weight = 0;
                for (char character : text.toCharArray()) {
                    weight += character - 'A' + 1;
                }

                System.out.println("Length: " + length);
                System.out.println("Weight: " + weight);
            }
        } while (!text.equals("END"));
	}

}
