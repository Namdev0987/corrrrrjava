package in.com.workout;

public class Ac {
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
		System.out.println("balance after deposite = "+ getBalance());
	}
	public void withdraw(int amt) {
		int total = getBalance() - amt;
		if(total < 2000) {
			System.out.println("insufficient balance ");
			
		}
		else {
			setBalance(total);
			System.out.println("balance after withdraw ="+ getBalance());
		}
	}
	public static void main(String[] args) {
		Ac a = new Ac();
		a.setBalance(10000);
		a.deposite(6000);
		a.withdraw(17000);
	}
	
}
