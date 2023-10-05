package in.com.stratoopsforbatch;

public class TestAccount {
public static void main(String[] args) throws CloneNotSupportedException {
	Account a = new Account(1000);
	//System.out.println(a.balance);
	Account a1 = (Account) a.clone();
	a1.balance = 500;
	System.out.println(a.balance);
	System.out.println(a1.balance);
}
}
