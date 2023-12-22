package ass2;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);

        System.out.print("Number of rows: ");
        int rows = input.nextInt();
        System.out.print("Number of columns: ");
        int columns = input.nextInt();

        int[][] field = new int[rows][columns];

        try {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.printf("el. [%d][%d] = ", i, j);
                    field[i][j] = input.nextInt();
                }
            }
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    sum += field[i][j];
                }
            }
            double average = (double) sum / (rows * columns);

            System.out.println("The sum = " + sum);
            System.out.println("The average = " + average);
        } catch (Exception e) {
            System.out.println("An exception has occurred");
        }
	}
  
}
