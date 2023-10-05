package in.com.homework;

public class TestFinally {
public static void main(String[] args) {
	try {
		int a = 10;
		int b = 5;
		int c = a / b ;
		System.out.println("division =" + c);
	} catch (Exception e) {
		System.out.println(e);
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	finally {
		System.out.println("harddep");
	}
}
}
