package in.com.newexceptionstart;

public class Practice {
public static void main(String[] args) {
	int a = 10;
	int b = 0;
	String name = null;
	String Name = "shivam";
//	int c = a / b;
//	System.out.println(c);
	try {
		int c = a/b;
		System.out.println(c);
	} catch (Exception e) {
		System.out.println(e);
	}
	try {
		System.out.println(name.length());
	} catch (Exception e) {
		System.out.println(e);
	}
	
	try {
		System.out.println(Name.charAt(7));
	} catch (Exception e) {
		System.out.println(e);
	}
}
	
}
