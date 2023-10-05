package in.com.common;

public class TestAasta {
public static void main(String[] args) throws CloneNotSupportedException {
	Aasta a = new Aasta(1000);
	Aasta a1 = (Aasta) a.clone();
	a1.balance = 2000;
	
	System.out.println(a.balance);
	System.out.println(a1.balance);
	System.out.println(a.balance);
}
}
