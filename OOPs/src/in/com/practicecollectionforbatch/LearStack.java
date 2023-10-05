package in.com.practicecollectionforbatch;

import java.util.Stack;

public class LearStack {
public static void main(String[] args) {
	Stack<String> a = new Stack<>();
	a.push( "cat");
	a.push("rohan");
	a.push("ghi");
	a.push("lion");
	System.out.println(a);
	
	System.out.println(a.peek());
	System.out.println(a.peek());
	a.pop();
	System.out.println(a.peek());
	a.pop();
	System.out.println(a.peek());
	
	
}
}
