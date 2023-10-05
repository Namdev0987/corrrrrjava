package in.com.cloningshivam;

public class Calcy1 {
	public static void main(String[] args) {
		double num1 = 1000;
		double num2 = 20;
		char operator = '+';
		double result;
		
		switch (operator) {
		case '+':
			result = num1 + num2;
			System.out.println("add  =" + result);
			break;

		default:
			break;
		}
	}

}
