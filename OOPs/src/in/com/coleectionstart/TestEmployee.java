package in.com.coleectionstart;

import java.util.ArrayList;
import java.util.Iterator;

public class TestEmployee {
public static void main(String[] args) {
	Employee e1 = new Employee(1, "hardeep", "kota");
	
	ArrayList list = new ArrayList();
	list.add(e1);
	
	
//	Employee e = (Employee) list.get(0);
//	System.out.println(e.getId());
//	System.out.println(e.getName());
//	System.out.println(e.getAddress());
	
//	for (int i = 0; i < list.size(); i++) {
//		
//		Employee e = (Employee) list.get(i);
//		System.out.println(e);
//		
//	}
	
//	for (Object object : list) {
//		Employee e = (Employee) object;
//		System.out.println(e);
//	}
	
	Iterator it = list.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	
	
}
}
