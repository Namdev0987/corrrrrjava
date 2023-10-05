package in.com.newexceptionstart;

public class Practice2 {
public static void main(String[] args) {
	try {
		int a=10;
		int b=0;
		int c = a/b;
		System.out.println(c);
	} catch (Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();;
	}
	finally {
		System.out.println("ye to chalega he");
	}
}
}
