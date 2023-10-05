package in.com.morningcloning;

public class Account implements Cloneable {
	
	public double balance = 0;
	
	public Account( double balance) {
		this.balance = balance;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	

}
