
public class LoanAccount extends BankAccount{

	public LoanAccount(double balance, int iban) {
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
