package in.com.newcloningstart;

public class TestAccount1 {
public static void main(String[] args) throws CloneNotSupportedException {
	Account1 a = new Account1(75);
	Account1 a2 = (Account1) a.clone();
	a2.balance=90;
	
	System.out.println(a.balance);
	System.out.println(a2.balance);
}
}
