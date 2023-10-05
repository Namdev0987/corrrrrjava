package in.com.exceptionbatch;

public class Testbatch2 {
public static void main(String[] args) {
	String name = null;
	
	try {
		System.out.println(name.length());
		System.out.println(name.charAt(8));
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
