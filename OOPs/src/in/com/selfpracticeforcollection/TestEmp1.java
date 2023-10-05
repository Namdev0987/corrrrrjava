package in.com.selfpracticeforcollection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestEmp1 {
public static void main(String[] args) {
//	Employee1 e1 = new Employee1(1, "ronu", "sagar");
//	
//	ArrayList list = new ArrayList();
//	list.add(e1);
	
//	for (int i = 0; i < list.size(); i++) {
//		System.out.println(list.get(i));
//	}
	
//	for(Object o : list) {
//		Employee1 e = (Employee1) o;
//		System.out.println(e);
//	}
	
//	Iterator it = list.iterator();
//	while(it.hasNext()) {
//		System.out.println(it.next());
//	}
//	String name1 = "shivam";
//	String name2 = "shivam";
//	String name3 = new String("shivam");
//	
//	System.out.println(name1.equals(name3));
//	System.out.println(name1 == name3);
//	Employee1 e1 = new Employee1(1, "shivam", "kota");
//	
//	Employee1 e2 = new Employee1(2, "shiva", "bhopal");
//	
//	System.out.println(e1.equals(e2));
	Employee1 e1 = new Employee1(1, "sachin", "indore");
	Employee1 e2 = new Employee1(1, "sachin", "indore");
	
	System.out.println(e1.equals(e2));
	System.out.println(e1.hashCode());
	System.out.println(e2.hashCode());
}
}
