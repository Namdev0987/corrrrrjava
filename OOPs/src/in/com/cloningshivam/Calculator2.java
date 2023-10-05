package in.com.cloningshivam;

public class Calculator2 {
public static void main(String[] args) {
	 double num1 = 10.0;
     double num2 = 5.0;
     char operator = '+'; // Change this to the desired operation (+, -, *, /)

     double result;

     switch (operator) {
         case '+':
             result = num1 + num2;
             break;
         case '-':
             result = num1 - num2;
             break;
         case '*':
             result = num1 * num2;
             break;
         case '/':
             if (num2 != 0) {
                 result = num1 / num2;
             } else {
                 System.out.println("Error: Division by zero");
                 return; // Exit the program
             }
             break;
         default:
             System.out.println("Invalid operator");
             return; // Exit the program
     }

     System.out.println("Result: " + result);
}
}
