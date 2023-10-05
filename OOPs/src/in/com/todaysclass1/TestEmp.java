package in.com.todaysclass1;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmp {
public static void main(String[] args) {
	ArrayList<Employee> e1 = new ArrayList();
	e1.add(new Employee(1, "arsh", "676767"));
	e1.add(new Employee(10, "shuvham", "787878"));
	e1.add(new Employee(2, "brachi", "67678"));
	e1.add(new Employee(4, "nikhil", "89890"));
	e1.add(new Employee(0, "gopal", "787890"));
	
	System.out.println(e1);
//	
	Collections.sort(e1,new Comparatorbyid());
	System.out.println(e1);
	
	
}
}
