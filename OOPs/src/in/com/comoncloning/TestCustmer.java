package in.com.comoncloning;

public class TestCustmer {
public static void main(String[] args) throws CloneNotSupportedException {
	
	 Customer c = new Customer("shiva");
	 Customer c1 = (Customer)c.clone();
	 c1.name= "yash";
	 c1.account.balance =(200);
	 
	 
	 System.out.println(c.name);
	 System.out.println(c1.name);
	 System.out.println(c.account.balance);
	 System.out.println(c1.account.balance);
	 
	 
}
}
