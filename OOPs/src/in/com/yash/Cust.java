package in.com.yash;

public class Cust implements Cloneable{
	String name = null;
	Account a = new Account();
	
	public Cust(String name, int balance) {
		this.name = name;
		this.a.balance = balance;
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Cust c = (Cust) super.clone();
		c.a = (Account) a.clone();
		return c;
	}
}
