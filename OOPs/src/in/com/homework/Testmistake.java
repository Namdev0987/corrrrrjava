package in.com.homework;

public class Testmistake {
	public static void main(String[] args) throws MistakeException {
		dad();
	}
	
	public static void dad() {
		mom();
	}
	
	public static void mom() {
		son();
	}
	
	public static void son() {
		MistakeException e = new MistakeException();
		
		try {
			throw e;
		} catch (Exception e2) {
			System.out.println(e2);
		}
	}

}
