package in.com.practiceoopbatch;

public class LoginException extends RuntimeException{
	public LoginException() {
		super("Invalid user");
	}
}
