package in.com.ppppp;

public class Uncheckedex {
	public static void main(String[] args) {
		dad();
		
	}
	public static void dad() {
		try {
			mom();
		} catch (RuntimeException e) {
			System.out.println("Caugth by Dad,raised by son");
		}
	}
	public static void mom() {
		son();
	}
	public static void son() {
		RuntimeException e = new RuntimeException("i made a mistake");
		throw e;
	}
}
