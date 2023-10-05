package in.com.cloningchapter;

public class TestCust {
public static void main(String[] args) throws CloneNotSupportedException {
	Customer c = new Customer("money", 121);
	Customer c2 = (Customer) c.clone();
	c2.name = "honey";
	c2.account.balance = 122;
	
	System.out.println(c.name);
	System.out.println(c.account.balance);
	
	System.out.println(c2.name);
	System.out.println(c2.account.balance);
}
}
