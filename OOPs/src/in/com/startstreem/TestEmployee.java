package in.com.startstreem;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmployee {
public static void main(String[] args) {
	ArrayList<Employee> emp = new ArrayList<>();
	emp.add(new Employee(98, "a", 8989));
	emp.add(new Employee(12, "d", 8989));
	emp.add(new Employee(10, "b", 8989));
	emp.add(new Employee(19, "s", 8989));
	emp.add(new Employee(91, "e", 8989));
	emp.add(new Employee(94, "x", 8989));
	
	System.out.println(emp);
	
	Collections.sort(emp, new Comparatorbyid());
	System.out.println(emp);
	
	ArrayList<Employee> emp1 = new ArrayList<>(emp);
	Collections.sort(emp1,new Comparatorbyname());
	System.out.println(emp1);
}
}
