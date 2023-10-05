package in.com.moreexception;

public class TestLoginException {
	public static void main(String[] args) throws RuntimeException{
		String name = "shivam";
		
		if (name.equals("shiva")) {
			System.out.println("vailid user");
		}
		else {
			LoginException e = new LoginException();
			try {
				throw e;
			} catch (Exception e2) {
				System.out.println(e2);
				e2.printStackTrace();
				System.out.println(e2.getMessage());
			}
		}
	}
}
