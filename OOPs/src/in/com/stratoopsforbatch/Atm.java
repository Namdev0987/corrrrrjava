package in.com.stratoopsforbatch;

public class Atm {
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
		System.out.println("Balance after deposite =" + getBalance());
	}
	
	public void withdraw(int amt) {
		int total = getBalance() - amt;
		
		if (total < 2000) {
			System.out.println("Insufficient Balance!!!!!!!");
		}else {
			setBalance(total);
			System.out.println("Balance after Withdraw =" + getBalance());
		}
	}
	public static void main(String[] args) {
		Atm a = new Atm();
		a.setBalance(10000);
		a.deposite(1000);
		a.withdraw(10000);
	}
	
}
