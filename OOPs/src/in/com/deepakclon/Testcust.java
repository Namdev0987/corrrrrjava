package in.com.deepakclon;

public class Testcust {
	public static void main(String[] args) throws CloneNotSupportedException {
		Customer c1 = new Customer("shivam");
		
		Customer c2 = (Customer) c1.clone();
		
		c2.name = "Balram";
		c2.a.balance = 20;
		
		System.out.println("Orignal Object");
		
		System.out.println("name =" + c1.name);
		System.out.println("balance =" + c1.a.balance);
		
		System.out.println("Clonable Obj");
		System.out.println("name =" + c2.name);
		System.out.println("balance =" + c2.a.balance);
	}

}
