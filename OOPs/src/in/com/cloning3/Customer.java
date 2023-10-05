package in.com.cloning3;

public class Customer implements Cloneable{
	String name = null;
	Account A = new Account();
	
	public Customer(String name,int balance) {
		this.name = name;
		this.A.balance = balance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer c = (Customer) super.clone();
		c.A = (Account) A.clone();
		return c;
	}
}
