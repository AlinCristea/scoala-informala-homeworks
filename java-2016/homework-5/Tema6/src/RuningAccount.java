
import java.util.Date;

public class RuningAccount extends BankAccount {

	public RuningAccount(Date accountCreationDate, float monthlyFee) {
		super(accountCreationDate, monthlyFee);
	}
@Override
	public void addFunds(float amount) {
		balance += amount;
	}
@Override
	public void withdrawFunds(float amount) throws InsufficientFundsException {
		if (amount > balance) {
			throw new InsufficientFundsException();
		}
		balance -= amount;
	}

	

}
