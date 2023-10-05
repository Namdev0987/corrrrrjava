package in.com.moreexception;

public class TestMistakeexception {
public static void main(String[] args) throws MistakeException{
	dad();
}
	public static void dad() throws MistakeException{
		mom();
	}
	public static void mom() throws MistakeException{
		son();
		
	}
	public static void son() throws MistakeException {
		MistakeException e = new MistakeException();
		try {
			throw e;
		} catch (Exception e2) {
			System.out.println(e2);
		}
	} 
}
