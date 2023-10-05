package in.com.home;

public class TestLogin {
	public static void main(String[] args) {
		String name = "Rays";
		if (name.equals("Rays")) {
			System.out.println("valid user");
		}
		else {
			LoginException e = new LoginException();
			
			try {
				throw e;
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		//System.out.println("after if else");
	}

}
