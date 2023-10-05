package in.com.home;

public class Testcust {
	public static void main(String[] args) throws CloneNotSupportedException {
		Customer c1 = new Customer("shivam");
		Customer c2 = (Customer) c1.clone();
		
		
		c2.name = "hardeep";
		c2.a.balance = 10001;
		
		System.out.println("Orignal");
		System.out.println(c1.name);
		System.out.println(c1.a.balance);
		
		System.out.println("clonabla");
		System.out.println(c2.name);
		System.out.println(c2.a.balance);
		
		
				
	}

}
