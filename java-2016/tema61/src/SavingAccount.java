
public class SavingAccount extends BankAccount {

	public SavingAccount(double balance, int iban) {
		super(balance, iban);

	}

	@Override
	public double addMoney(double sold) {

		balance = balance + sold;

		return balance;
	}

	@Override
	public double withdrawMoney(double sold) {
		balance = balance - (sold+(0.002*sold));
		System.out.println("bani retrasi sunt :"+sold);
		return balance;

	}

}
