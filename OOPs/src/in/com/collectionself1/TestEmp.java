package in.com.collectionself1;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmp {
public static void main(String[] args) {
	ArrayList<Employee> e1 = new ArrayList();
	e1.add(new Employee(1, "shiva" ,"6789"));
	e1.add(new Employee(20, "bhavna", "789"));
	e1.add(new Employee(6, "cap", "6789"));
	e1.add(new Employee(4, "abhi", "7899"));
	
	System.out.println(e1);
	
	Collections.sort(e1);
	System.out.println(e1);
}
}
