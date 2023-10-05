package in.com.fridaycomparator15;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmp {
public static void main(String[] args) {
	ArrayList<Employee> emp = new ArrayList();
	emp.add(new Employee(5, "deepesh", "123456"));
	emp.add(new Employee(10, "aman", "123451"));
	emp.add(new Employee(1, "chandu", "123450"));
	emp.add(new Employee(6, "gopal", "123458"));
	emp.add(new Employee(12, "nikhil", "123459"));
	
	System.out.println(emp);
	
	Collections.sort(emp,new ComparatorById());
	System.out.println(emp);
	
	ArrayList<Employee>emp1 = new ArrayList(emp);
	Collections.sort(emp1,new ComparatorbyName());
	System.out.println(emp1);
	
	
}
}
