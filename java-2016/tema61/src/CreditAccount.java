
public class CreditAccount extends BankAccount {

	public CreditAccount(double balance, int iban) {
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
