package in.com.newcloningstart;

public class Account implements Cloneable{
	
	int balance ;
//	public Account(int balance) {
//		this.balance = balance;
//	}
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
