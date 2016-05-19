import java.util.Scanner;

public abstract class BankAccount {
	double balance;
	int iban;

	public BankAccount(double balance, int iban) {
		this.balance = balance;
		this.iban = iban;

	}

	public double getBalance() {

		return balance;

	}

	public double getIban() {

		return iban;

	}

	public double addMoney(double sold) {

		balance = balance + sold;

		return balance;
	}

	public double withdrawMoney(double sold) {
		balance = balance - sold;
		return balance;

	}

}
