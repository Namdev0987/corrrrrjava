package in.com.raysdemon22;

public class Racing extends Thread{
	String name = null;
	
	static Account account = new Account();
	
	public Racing(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			this.account.deposite(name, 1000);
		}
	}
}
