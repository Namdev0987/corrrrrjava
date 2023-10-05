package in.com.yash;

public class Account implements Cloneable{
	int balance ;
	
	
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
