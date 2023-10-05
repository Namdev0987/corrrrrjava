package in.com.ppppp;

public class Testlogin {
public static void main(String[] args) {
	String name = "shiva";
	
	if(name.equals("shiv")) {
		System.out.println("valid user");
	}
	else {
		Login e = new Login();
		
		
		try {
			throw e;
		} catch (Login e2) {
			System.out.println(e2);
		}
	}
}
}
