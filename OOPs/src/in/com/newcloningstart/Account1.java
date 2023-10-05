package in.com.newcloningstart;

public class Account1 implements Cloneable{
	int balance;
	
	public Account1(int balance) {
		this.balance = balance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	
}
