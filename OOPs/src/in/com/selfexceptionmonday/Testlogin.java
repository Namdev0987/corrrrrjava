package in.com.selfexceptionmonday;

public class Testlogin {
	public static void main(String[] args) throws LoginException {
		String name = "rays";
		if(name.equals("rays")) {
			System.out.println("valid user");
		}
		
		
		
		else {
			LoginException e = new LoginException();
			try {
				throw e;
			} catch (Exception e2) {
				System.out.println(e2);
				//System.out.println(e2.getMessage());
				//e.printStackTrace();
			}
			
			
			
			
		}
		
		
		
		
		
	}
}
