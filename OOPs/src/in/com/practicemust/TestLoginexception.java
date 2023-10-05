package in.com.practicemust;

public class TestLoginexception {
public static void main(String[] args) {
	String name = "shivam";
	if(name.equals("shiva")) {
		System.out.println("Vailid user");
	}
	else {
		LoginException e = new LoginException();
		try {
			throw e;
		} catch (Exception e2) {
			System.out.println(e2);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
}
