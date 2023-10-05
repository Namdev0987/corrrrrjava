package in.com.cloning2;

public class TestCust {
public static void main(String[] args) throws CloneNotSupportedException {
	Custmor c1 = new Custmor("deepak", 175);
	Custmor c2 = (Custmor) c1.clone();
	c2.name = "raj";
	c2.A.balance = 501;
	  
	System.out.println(c1.name);
	System.out.println(c1.A.balance);
	
	System.out.println(c2.name);
	System.out.println(c2.A.balance);
}
}
