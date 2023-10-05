package in.com.newcloningstart;

public class Customer implements Cloneable{
	String name = null;
	Account account = new Account();
	
	public Customer(String name,int balance) {
		this.name = name;
		this.account.balance = balance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer c = (Customer) super.clone();
		c.account = (Account) account.clone();
		return c;
	}
	
	
	
}