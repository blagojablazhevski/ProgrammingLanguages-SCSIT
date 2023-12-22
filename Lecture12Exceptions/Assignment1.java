package ass1;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			System.out.print("What is your name? ");
			String name = input.nextLine();

			System.out.print("Which year were you born in? ");
			int birthYear = input.nextInt();

			System.out.print("How tall (in meters) are you? ");
			double height = input.nextDouble();

			System.out.print("What is your weight (in kilograms)? ");
			double weight = input.nextDouble();
			
			int currentYear = 2023;
			int age = currentYear - birthYear;
			double bmi = weight / (height * height);
			
			System.out.println("Your name is " + name);
			System.out.println("This year you'll turn " + age);
			System.out.println("Your body-mass index is " + bmi);
		} catch (Exception e) {
			System.out.println("An exception has occured.");
		}
	}

}
