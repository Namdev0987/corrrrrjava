package in.com.practiceoopbatch;

public class Testfinally {
public static void main(String[] args) {
	try {
		int a = 10;
		int b = 0;
		int c = a / b;
		System.out.println("Division=" + c);
	} catch (Exception e) {
		System.out.println(e);
		System.out.println(e.getMessage());
		//e.printStackTrace();
		//e.getLocalizedMessage();
	}
	finally {
		System.out.println("finally block");
	}
}
}
