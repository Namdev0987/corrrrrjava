package in.com.moreexception;

import in.com.exception.InsufficientBalance;

public class Account {
	private int balance = 0;
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	public void deposite(int amount) {
		int total = getBalance() + amount;
		setBalance(total);
		System.out.println("Balance after deposite =" + getBalance());
	}
	
	public void withdrawl(int amount) throws InsufficientFund{
		int total = getBalance() - amount;
		if (total > 2000) {
			setBalance(total);
			System.out.println("balance after withrawl =" + getBalance());
		}
		else {
			InsufficientFund  e = new InsufficientFund();
			throw e;
		}
	}
}
