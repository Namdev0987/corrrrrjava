package in.com.newexceptionstart;

public class TestCust {
public static void main(String[] args) throws CloneNotSupportedException {
	Customer c1 = new Customer("king", 101);
	Customer c2 = (Customer) c1.clone();
	c2.name = "kalyan";
	c2.a.balance = 102;
	
	System.out.println(c1.name);
	System.out.println(c1.a.balance);
	
	System.out.println(c2.name);
	System.out.println(c2.a.balance);
}
}
