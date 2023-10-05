package in.com.workout;

public class Accout1 {
	private int balance = 0;
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void deposite(int amt) {
		int total = getBalance() + amt;
		setBalance(total);
		System.out.println("balance after deposite =" + getBalance());
	}
	
	public void widthrawl(int amt) {
		int total = getBalance() - amt;
		
	}
}
