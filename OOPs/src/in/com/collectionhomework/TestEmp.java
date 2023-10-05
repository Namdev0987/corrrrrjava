package in.com.collectionhomework;

import java.util.ArrayList;

public class TestEmp {
public static void main(String[] args) {
	Employee e1 = new Employee(1, "deepu", "indore");
	
	Employee e2 = new Employee(2, "shivam", "bhopal");
	
	ArrayList list = new ArrayList();
	
	list.add(e1);
	list.add(e2);
	
	Employee e= (Employee) list.get(0);
	
	System.out.println(e);
	
	System.out.println(e.getId());
	
	System.out.println(e.getName());
	
	System.out.println(e.getAddress());
}
}
