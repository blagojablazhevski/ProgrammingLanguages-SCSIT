package ass4;

public class Account {

	String bankName;
	int amount;


    public Account(String bankName, int amount) {
        this.bankName = bankName;
        this.amount = amount;
    }

    public String getBankName() {
        return bankName;
    }

    public int getAmount() {
        return amount;
    }

    public void add(int plus) {
        amount += plus;
    }

    public void withdraw(int minus) {
        if (minus <= amount) {
            amount -= minus;
        } else {
            System.out.println("There is not sufficient amount on the account.");
        }
    }

    public void clearAccount() {
        amount = 0;
        System.out.println("You have drawn the entire amount from the account.");
    }

}
