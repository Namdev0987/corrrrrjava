package in.com.cloningshallow;

public class TestAccount {
public static void main(String[] args) throws CloneNotSupportedException {
	Account a1 = new Account(101);
	Account a2 = (Account) a1.clone();
	a2.balance = 501;
	
	System.out.println(a1.balance);
	System.out.println(a2.balance);
}
}
