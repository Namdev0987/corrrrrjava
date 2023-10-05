package in.com.selfexception;

public class TestHome2 {
public static void main(String[] args) {
	String name = "shivam";
	System.out.println(name.length());
	try {
		System.out.println(name.charAt(8));
		
	} catch (Exception e) {
		System.out.println(e);
	}
	
}
}
