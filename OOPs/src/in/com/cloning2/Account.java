package in.com.cloning2;

public class Account implements Cloneable{
	int balance;
	
	public Account() {
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
