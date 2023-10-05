package in.com.workout;

public class Account {
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
		System.out.println("balance after deposite"+ getBalance());
	}
	public  void Withdrawl(int amt) {
		int total = getBalance() - amt;
		
		if(total < 2000) {
			System.out.println("insufficient Balance.....!!!!!");
		}else {
			setBalance(total);
			
			System.out.println("balance after widthral" + getBalance());
		}
	}
	public static void main(String[] args) {
		Account a = new Account();
		a.setBalance(9000);
		a.deposite(4000);
		a.Withdrawl(2000);
	}
	
	
	
	
}
