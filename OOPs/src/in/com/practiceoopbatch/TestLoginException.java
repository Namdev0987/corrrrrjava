package in.com.practiceoopbatch;

public class TestLoginException {
public static void main(String[] args) {
	String name ="hardeep";
	if (name.equals("harde")) {
		System.out.println("Valid user");
		
	}
	else {
		LoginException e = new LoginException();
		try {
			throw e;
		} catch (Exception e2) {
			System.out.println(e);
		}
	}
}
}
