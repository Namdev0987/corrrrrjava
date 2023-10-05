package in.com.homework;

public class TestLoginException {
public static void main(String[] args) {
	String name = "shivam";
	
	if(name.equals("shiv")) {
		System.out.println("vailid user!!!!!");
	}
	else {
		LoginException e = new LoginException();
		try {
			throw e;
		} catch (Exception e2) {
			System.out.println(e2);
		}
	}
}
}
