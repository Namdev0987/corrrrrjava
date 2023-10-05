package in.com.practicemust;

public class LoginException extends RuntimeException {
	public LoginException() {
		super("Invalid User");
	}
}
