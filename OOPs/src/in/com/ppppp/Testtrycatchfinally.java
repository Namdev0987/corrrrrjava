package in.com.ppppp;

public class Testtrycatchfinally {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e);
			//System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		finally {
			System.out.println("finally block");
		}
	}

}
