package in.com.yash;

public class Testcust {
public static void main(String[] args) {
	Cust c1 = new Cust("ram", 10000);
	System.out.println(c1.name);
	System.out.println(c1.a.balance);
	
	Cust c2 = c1;
	c2.name = "aman";
	c2.a.balance = 2000;
	System.out.println(c2.name);
	System.out.println(c2.a.balance);
	
	
	
}
}
