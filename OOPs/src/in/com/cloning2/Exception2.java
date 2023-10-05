package in.com.cloning2;

public class Exception2 {
public static void main(String[] args) {
	String name = null;
	int a = 10;
	int b = 5;
	int c = a/b;
	System.out.println(c);
	try {
		System.out.println(name.charAt(0));
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
