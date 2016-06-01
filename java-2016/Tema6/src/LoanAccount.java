
import java.util.Date;

public class LoanAccount extends BankAccount {

	public LoanAccount(Date accountCreationDate, float monthlyFee) {
		super(accountCreationDate, monthlyFee);
	}
	public void addFunds(float monthlyFee) {
		monthlyFee=(balance/60)+(balance*0.1f);
		balance +=monthlyFee ;
	}
	
	@Override
	public void withdrawFunds(float amount) throws InsufficientFundsException {
		throw new UnsupportedOperationException();
	}

}
