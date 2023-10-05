package in.com.fridaybatch15;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmp {
public static void main(String[] args) {
	ArrayList<Employee>emp = new ArrayList();
	emp.add(new Employee(2, "aman", "12345"));
	emp.add(new Employee(10, "chandu", "12341"));
	emp.add(new Employee(1, "bhvna", "123450"));
	
	System.out.println(emp);
	Collections.sort(emp,new Compararatorbyid());
	System.out.println(emp);
	
	ArrayList<Employee>emp1 = new ArrayList(emp);
	Collections.sort(emp1,new Comparatorbyname());
	System.out.println(emp1);
	
}
}
