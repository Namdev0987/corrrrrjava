package in.com.selfexception;

public class Multiexception {
public static void main(String[] args) {
	 

		int a = 10;

		int b = 7;
		
		String name = null;

		System.out.println("1");

		try {
			
			int c = a / b;
			
			System.out.println("Division = " + c);
			
			System.out.println(name.length());
			
			System.out.println(name.charAt(4));
			
		} catch (NullPointerException e) {
			
			System.out.println(e);
			
		}catch (StringIndexOutOfBoundsException e) {
			
			System.out.println(e);
			
		}catch (ArithmeticException e) {
			
			System.out.println(e);
			
		}catch (Exception e) {
			
			System.out.println(e);
			
		}

		System.out.println("2");

}
}
