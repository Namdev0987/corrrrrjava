package in.com.comparator;

import java.util.ArrayList;
import java.util.Iterator;

public class TestEmployee1 {
public static void main(String[] args) {
	Employee1 e1 = new Employee1(1, "shiva", "indore");
	//Employee1 e2 = new Employee1(2, "namdev", "bhopal");
	
	ArrayList list = new ArrayList();
	list.add(e1);
	//list.add(e2);
	
	//Employee1 e = (Employee1) list.get(0);
//	System.out.println(e);
//	System.out.println(e1.getName());
//	System.out.println(e2.getName());
//	System.out.println(e1.getId());
	
//	for (int i = 0; i < list.size(); i++) {
//		Employee1 e = (Employee1) list.get(i);
//		System.out.println(e);
//	}
	
//	for (Object object : list) {
//		Employee1 e = (Employee1) object;
//		System.out.println(e);
//	}
	
//	Iterator it = list.iterator();
//	while(it.hasNext()) {
//		Employee1 e = (Employee1) it.next();
//		System.out.println(e);
//	}
//	for (int i = 0; i < list.size(); i++) {
//		Employee1 e = (Employee1) list.get(i);
//		System.out.println(e);
//	}
	
	
//	Employee1 e = (Employee1) list.get(0);
//	System.out.println(e.getId());
	
//	for (int i = 0; i < list.size(); i++) {
//		Employee1 e = (Employee1) list.get(i);
//		System.out.println(e);
//	}
	
//	for (Object object : list) {
//		Employee1 e = (Employee1) object;
//		System.out.println(e);
//	}
	
	Iterator it = list.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
}
}
