package in.com.cloningchapter;

public class Exception1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		try {
			int c =  a /b;
			System.out.println("division =" + c);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		String name = "shivam";
		try {
			System.out.println(name.charAt(10));
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
		String name1 = null;
		try {
			System.out.println(name1.length());
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
