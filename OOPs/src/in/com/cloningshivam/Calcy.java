package in.com.cloningshivam;

public class Calcy {
public static void main(String[] args) {
	double num1 = 100.0;
	double num2 = 10.0;
	
	char Operator = '=';
	double result;
	
	switch (Operator) {
	case '-':
		result = num1 - num2;
		System.out.println("sub =" +  result);
		
		break;
		
	case '+':
		result = num1 + num2;
		System.out.println("add =" +  result);
		
		break;
		
	case '*':
		result = num1 * num2;
		System.out.println("mult =" +  result);
		
		break;
		
	case '/':
		result = num1 / num2;
		System.out.println("division =" +  result);
		
		break;

	default:
		System.out.println("invalid operator");
		break;
	}
}
}
