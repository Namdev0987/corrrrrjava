package in.com.deamon22;

public class Account {
	private int balance = 0;
	
	public void setBalance(int balance) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance = balance;
	}
	
	public int getBalnce() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return balance;
	}
	
	public synchronized  void deposite(String name ,int amount) {
		int total = getBalnce() + amount;
		setBalance(total);
		System.out.println(name + "balance" + getBalnce());
	}
}
