package ass4;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		// Taking initial values for bank and amount input from the keyboard
		System.out.print("Input a bank: ");
		String bankName = input.nextLine();
		System.out.print("Input the initial amount: ");
		int initialAmount = input.nextInt();

		// Creating an object myAccount with initial values
		Account myAccount = new Account(bankName, initialAmount);

		// Interactive menu operations while the amount > 0
		while (myAccount.getAmount() > 0) {
			System.out.println("\nChoose from the menu:\n");
			System.out.println("1. Bank");
			System.out.println("2. State");
			System.out.println("3. Add");
			System.out.println("4. Withdraw");
			System.out.println("5. Clear Account");
			System.out.println("6. Exit\n");

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
			case 6:
				System.out.println("Exiting the ATM. Thank you!");
				return;
			default:
				System.out.println("Invalid choice! Please enter a valid option.");
			}
		}

	}

}
