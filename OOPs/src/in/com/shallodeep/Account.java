package in.com.shallodeep;

public class Account implements Cloneable{
	int balance = 100;
	
	public Account() {
		
	}
	
	public Account(int balance) {
		this.balance = balance;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
