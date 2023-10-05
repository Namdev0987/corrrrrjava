package in.com.deepakclon;

public class Customer implements Cloneable{
	public String name = null;
	public Account a = null;
	
	public Customer(String name) {
		this.name = name;
		this.a = new Account(100);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer c = (Customer) super.clone();
		a = (Account) a.clone();
		return c;
	}
	
	
	
}
