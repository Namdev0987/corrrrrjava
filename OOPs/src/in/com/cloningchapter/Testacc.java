package in.com.cloningchapter;

public class Testacc {
public static void main(String[] args) throws CloneNotSupportedException {
	Account a = new Account(101);
	Account a2 = (Account) a.clone();
	a2.balance = 102;
	
	System.out.println(a.balance);
	System.out.println(a2.balance);
}
}
