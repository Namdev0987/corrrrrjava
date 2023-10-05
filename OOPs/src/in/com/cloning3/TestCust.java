package in.com.cloning3;

public class TestCust {
public static void main(String[] args) throws CloneNotSupportedException {
	Customer c1 = new Customer("ram", 99);
	Customer c2 = (Customer) c1.clone();
	c2.name = "lokesh";
	c2.A.balance = 101;
	
	System.out.println(c1.name);
	System.out.println(c1.A.balance);
	
	
	System.out.println(c2.name);
	System.out.println(c2.A.balance);
}
}
