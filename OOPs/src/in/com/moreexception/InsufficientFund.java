package in.com.moreexception;

public class InsufficientFund extends Exception {
	public InsufficientFund() {
		super("insufficient balance!!!!");
	}
}
