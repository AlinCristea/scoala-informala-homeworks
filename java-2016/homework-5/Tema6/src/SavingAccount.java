
import java.util.Calendar;
import java.util.Date;

public class SavingAccount extends BankAccount{

	public SavingAccount(Date accountCreationDate, float monthlyFee) {
		super(accountCreationDate, monthlyFee);
	}
	@Override
	public void addFunds(float amount) {
		balance += amount;
	}

	public void withdrawFunds(float amount) throws InsufficientFundsException {
		if (amount > balance) {
			throw new InsufficientFundsException();
		}
		balance =balance -( amount+(0.002f*amount));
	}

	public float getBalance( Date balanceDate) {
		return getBalanceWithMonthlyFeesApplied(balanceDate, monthlyFee,accountCreationDate);
	}
	private float getBalanceWithMonthlyFeesApplied(Date balanceDate, float monthlyFee,Date accountCreationDate) {
		
		// We assume that the account dates are always from the same year to not
		// overcomplicate the number of months
		Calendar accountCreationTime = Calendar.getInstance();
		accountCreationTime.setTime(accountCreationDate);
		// JANUARY is 0
		int accountCreationMonth = accountCreationTime.get(Calendar.MONTH);
		Calendar balanceTime = Calendar.getInstance();
		balanceTime.setTime(balanceDate);
		int currentMonth = balanceTime.get(Calendar.MONTH);
		return balance -( monthlyFee * (currentMonth - accountCreationMonth)*0.005f);
	}

}
