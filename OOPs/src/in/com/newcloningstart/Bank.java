package in.com.newcloningstart;

public class Bank implements Cloneable {
	int balance ;
	
	public Bank(int balance) {
		this.balance = balance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}
	
}
