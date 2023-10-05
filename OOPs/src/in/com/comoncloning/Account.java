package in.com.comoncloning;

public class Account implements Cloneable {
	int balance ;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	 public Account( int balance) {
		 this.balance= balance;
	
	}@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
