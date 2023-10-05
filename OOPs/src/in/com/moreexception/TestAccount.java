package in.com.moreexception;

public class TestAccount {
public static void main(String[] args) {
	Account a = new Account();
	a.deposite(5000);
	try {
		a.withdrawl(9001);
	} catch (InsufficientFund e) {
		System.out.println(e);
	}
	a.deposite(1000);
}
}
