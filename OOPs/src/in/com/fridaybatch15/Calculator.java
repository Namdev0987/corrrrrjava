package in.com.fridaybatch15;

public class Calculator {
public static void main(String[] args) {
	double num1 = 1000.00;
	double num2 = 20.0;
	char operator = '=';
	double result ;
	
	switch (operator) {
	case '+':
		result = num1 + num2;
		System.out.println("addistion=" + result);
		
		break;
	case '-':
		result = num1 - num2;
		System.out.println("sub =" + result);
		
		break;

	default:
		System.out.println("invalid operator");
		break;
	}
}
}
