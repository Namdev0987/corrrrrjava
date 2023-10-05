package in.com.cloning2;

public class Custmor implements Cloneable{
	String name;
	Account A = new Account();
	
	public Custmor(String name,int balance) {
		this.name = name;
		this.A.balance = balance;
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Custmor c = (Custmor) super.clone();
		c.A = (Account) A.clone();
		return c;
	}
}
