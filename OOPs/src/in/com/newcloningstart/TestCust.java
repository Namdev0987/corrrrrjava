package in.com.newcloningstart;

public class TestCust {
public static void main(String[] args) throws CloneNotSupportedException {
	Customer c1 = new Customer("yash", 100);
	Customer c2 = (Customer) c1.clone();
	c2.name = "shiv";
	c2.account.balance = 500;
	
	System.out.println(c1.name);
	System.out.println(c1.account.balance);
	
	System.out.println(c2.name);
	System.out.println(c2.account.balance);
}
}
