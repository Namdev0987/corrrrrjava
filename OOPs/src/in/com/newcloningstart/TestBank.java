package in.com.newcloningstart;

public class TestBank {
public static void main(String[] args) throws CloneNotSupportedException {
	Bank b = new Bank(100);
	Bank b1 = (Bank) b.clone();
	b1.balance = 1000;
	System.out.println(b.balance);
	System.out.println(b1.balance);
}
}
