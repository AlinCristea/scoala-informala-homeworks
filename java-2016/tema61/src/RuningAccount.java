
public class RuningAccount extends BankAccount {

	public RuningAccount(double balance, int iban) {
		super(balance, iban);
		
	}

	@Override
	public double addMoney(double sold) {

		balance = balance + sold;

		return balance;
	}

	@Override
	public double withdrawMoney(double sold) {
		balance = balance - sold;
		return balance;

	}

	

}
