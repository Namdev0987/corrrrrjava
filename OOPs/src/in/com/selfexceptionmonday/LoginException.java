package in.com.selfexceptionmonday;

public class LoginException extends RuntimeException{
	public LoginException() {
		super("invailid user");
	}
}
