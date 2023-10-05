package in.com.comparator1;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmployee {
public static void main(String[] args) {
	ArrayList<Employee> emp = new ArrayList<>();
	emp.add(new Employee("shivam", 992632, 1));
	emp.add(new Employee("maruti", 878788, 6));
	emp.add(new Employee("danik", 787878, 8));
	emp.add(new Employee("ankit", 878787, 10));
	emp.add(new Employee("ronak", 7878786, 2));
	
	Collections.sort(emp, new SortbyidComparator());
	System.out.println(emp);
	
	ArrayList<Employee> emp1 = new ArrayList<>(emp);
	Collections.sort(emp1,new SortnamebyComparator());
	System.out.println(emp1);
}
}
