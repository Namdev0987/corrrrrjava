package in.com.common;

public class TestAccount {
public static void main(String[] args) {
	SavingAccount s = new SavingAccount();
	Account a = new Account();
	Account sa = new SavingAccount();
	
	
	System.out.println(s.getAmount());
	System.out.println(a.getAmount());
	System.out.println(sa.getAmount());
}
}
