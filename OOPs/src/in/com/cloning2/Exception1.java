package in.com.cloning2;

public class Exception1 {
public static void main(String[] args) {
	int a = 10;
	int b = 0;
	try {
		String name = "shivam";
		System.out.println(name.charAt(10));
	} catch (Exception e) {
		System.out.println(e);
	}
	try {
		int c = a / b;
		System.out.println("division =" + c);
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
