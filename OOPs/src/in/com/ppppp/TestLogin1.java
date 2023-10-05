package in.com.ppppp;

public class TestLogin1 {
	
	public static void main(String[] args) {
		String name = "Ram";
		
		if(name.equals("Ram")) {
			System.out.println("Valid user !!!!");
		}
		else {
			Login1 e = new Login1();
			try {
				throw e;
				
			} catch (Login1 e1) {
				System.out.println(e1);
			}
		}
	}

}
