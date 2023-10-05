package in.com.stream18;
public class Stream1 {
public static void main(String[] args){
	double num1 = 1700;
	double num2 = 2;
	char operator = '*';
	double result;
	switch (operator) {
	case '-':
		result = num1 - num2;
		System.out.println("sub=" + result);
		break;
		
	case '+':
		result = num1 + num2;
		System.out.println("Add=" + result);
		break;
		
	case '*':
		result = num1 * num2;
		System.out.println("Mult=" + result);
		break;
		
	case '/':
		result = num1 / num2;
		System.out.println("Devide=" + result);
		break;
		

	default:
		System.out.println("invailid operator!!!!");
		break;
	}
	
	
}
}
