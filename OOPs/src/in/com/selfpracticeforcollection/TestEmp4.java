package in.com.selfpracticeforcollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestEmp4 {
public static void main(String[] args) {
	Employee4 e1 = new Employee4(3, "abhi", 1200);
	Employee4 e2 = new Employee4(2, "virat", 1000);
	Employee4 e3 = new Employee4(1, "dinesh", 2500);
	Employee4 e4 = new Employee4(4, "shivanshi", 2000);
	Employee4 e5 = new Employee4(5, "yash", 100);
	Employee4 e6 = new Employee4(6, "deepak", 5000);
	Employee4 e7 = new Employee4(7, "shiva", 5001);
	
	List<Employee4>list = new ArrayList<Employee4>();
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);
	list.add(e5);
	list.add(e6);
	list.add(e7);
	
	Collections .sort(list);

	
	for (Employee4 employee4 : list) {
		
		System.out.println(employee4);
		
	}
}
}
