package in.com.hardeepcomparator;

import java.util.ArrayList;
import java.util.Collections;

public class Testemp {
public static void main(String[] args) {
	ArrayList<Employee>emp = new ArrayList();
	emp.add(new Employee(20, "shivam", "12340"));
	emp.add(new Employee(3, "ankit", "12342"));
	emp.add(new Employee(10, "gun", "12341"));
	emp.add(new Employee(2, "darshan", "12346"));
	emp.add(new Employee(4, "pnkj", "12345"));
	
	System.out.println(emp);
	
	Collections.sort(emp, new Comparatorbyid());
	System.out.println(emp);
	
	ArrayList<Employee>emps = new ArrayList(emp);
	Collections.sort(emps, new Comparatoorbyname());
	System.out.println(emps);
	
	ArrayList<Employee>emps1 = new ArrayList(emps);
	Collections.sort(emps1,new ComparatorbyPhone());
	System.out.println(emps1);
}
}
