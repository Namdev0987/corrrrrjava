package in.com.cloningshallow;

public class Testcust {
public static void main(String[] args) throws CloneNotSupportedException {
	Customer c1 = new Customer("rahul",101);
	Customer c2 = (Customer) c1.clone();
	c2.name = "hariom";
	c2.a.balance = 201;
	
	System.out.println(c1.name);
	System.out.println(c1.a.balance);
	
	System.out.println(c2.name);
	System.out.println(c2.a.balance);
}
}
