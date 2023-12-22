package ass4;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		System.out.print("Input a bank: ");
		String bankName = input.nextLine();
		System.out.print("Input the initial amount: ");
		int initialAmount = input.nextInt();

		Account myAccount = new Account(bankName, initialAmount);

		while (myAccount.getAmount() > 0) {
			System.out.println("\nChoose from the menu:\n");
			System.out.println("1. Bank overview");
			System.out.println("2. Account overview");
			System.out.println("3. Cash addition");
			System.out.println("4. Cash withdrawal");
			System.out.println("5. Account clearing");

			int choice = input.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Your accout is in the bank: " + myAccount.getBankName());
				break;
			case 2:
				System.out.println("On your account you have " + myAccount.getAmount() + " den.");
				break;
			case 3:
				System.out.print("Input amout to add: ");
				int addAmount = input.nextInt();
				myAccount.add(addAmount);
				break;
			case 4:
				System.out.print("Input the amount to withdraw: ");
				int withdrawAmount = input.nextInt();
				myAccount.withdraw(withdrawAmount);
				break;
			case 5:
				myAccount.clearAccount();
				break;
			default:
				System.out.println("Invalid choice! Please enter a valid option.");
			}
		}

	}

}
