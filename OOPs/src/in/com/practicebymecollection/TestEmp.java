package in.com.practicebymecollection;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmp {
public static void main(String[] args) {
	ArrayList<Employee> emp = new ArrayList();
	emp.add(new Employee(12, "shivam", "12345"));
	emp.add(new Employee(3, "gun", "12342"));
	emp.add(new Employee(1, "ankit", "12346"));
	emp.add(new Employee(10, "mukul", "12346"));
	emp.add(new Employee(11, "deepak", "12343"));
	
	System.out.println(emp);
	
	Collections.sort(emp,new ComparatorbyId());
	System.out.println(emp);
	
	ArrayList<Employee>emps = new ArrayList(emp);
	Collections.sort(emps, new ComparatorbyName());
	System.out.println(emps);
	
	ArrayList<Employee>emps1 = new ArrayList(emps);
	Collections.sort(emps1,new ComparatorbyPhone());
	System.out.println(emps1);
	
}
}
