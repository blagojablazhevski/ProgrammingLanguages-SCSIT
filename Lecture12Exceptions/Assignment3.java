package ass3;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);

        String text;
        do {
            System.out.print("Input the text. To finish inputting, input END: ");
            text = input.nextLine();

            if (!text.equalsIgnoreCase("END")) {
                int length = text.length();
                int weight = 0;
                for (char character : text.toCharArray()) {
                    weight += character - 'A' + 1;
                }

                System.out.println(text + " has " + length + " characters, and its weight is " + weight);
            }
        } while (!text.equals("END"));
	}

}
