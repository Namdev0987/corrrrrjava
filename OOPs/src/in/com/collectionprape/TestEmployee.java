package in.com.collectionprape;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmployee {
public static void main(String[] args) {
	ArrayList<Employee> emp = new ArrayList();
	emp.add(new Employee(1, "bsd", 12345));
	emp.add(new Employee(4, "asdf", 7879));
	emp.add(new Employee(0, "kanak", 78989));
	emp.add(new Employee(3, "shivam", 7890));
	emp.add(new Employee(-1, "kkyu", 909090));
	
	System.out.println(emp);
	
	Collections.sort(emp, new SortbyidComparator());
	System.out.println(emp);
	
	
	ArrayList<Employee> emp2 = new ArrayList<>(emp);
	Collections.sort(emp2,new SortbynameComparator());
	System.out.println(emp2);
	
}
}
