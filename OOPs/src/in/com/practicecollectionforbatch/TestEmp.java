package in.com.practicecollectionforbatch;

import java.util.ArrayList;
import java.util.Iterator;

public class TestEmp {
	public static void main(String[] args) {
		Employee e1 = new Employee(12, "shivam", "indore");
		Employee e2 = new Employee(13, "surya", "bhpal");
		Employee e3 = new Employee(14, "sachin", "delhi");
		
		ArrayList list = new ArrayList();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
//		Employee e = (Employee) list.get(0);
//		System.out.println(e);
//		System.out.println(e.getId());
//		System.out.println(e.getName());
//		System.out.println(e.getAdress());
		
		
//		
//		for (int i = 0; i < list.size(); i++) {
//
//			Employee e = (Employee) list.get(i);
//
//			System.out.println(e);
//
//		}
		
//		
//for (Object object : list) {
//			
//			Employee e = (Employee) object;
//			
//			System.out.println(e);
//			
//		}
		
		Iterator it = list.iterator();

		while (it.hasNext()) {

			Employee e = (Employee) it.next();

			System.out.println(e);
			it.remove();

		}

		System.out.println(list);
//		
	}
	
	
}
