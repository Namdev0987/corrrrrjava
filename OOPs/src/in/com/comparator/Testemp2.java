package in.com.comparator;

import java.util.ArrayList;
import java.util.Iterator;

public class Testemp2 {
public static void main(String[] args) {
	Employee2 e1 = new Employee2(1, "king", "delhi");
	
	ArrayList list = new ArrayList();
	list.add(e1);
	
//	Employee2 e = (Employee2) list.get(0);
//	System.out.println(e.getId());
//	System.out.println(e.getName());
//	System.out.println(e.getAddress());
	
//	for (int i = 0; i < list.size(); i++) {
//		Employee2 e = (Employee2) list.get(i);
//		System.out.println(e);
//	}
	
//	for(Object object : list) {
//		Employee2 e = (Employee2) object;
//		System.out.println(e);
//	}
	
//	Iterator it = list.iterator();
//	while(it.hasNext()) {
//		System.out.println(it.next());
//		//System.out.println();
//	}
//	Employee2 e = (Employee2) list.get(0);
//	System.out.println(e.getId());
//	System.out.println(e.getName());
//	System.out.println(e.getAddress());
	
//	for (int i = 0; i < list.size(); i++) {
//		Employee2 e = (Employee2) list.get(i);
//		System.out.println(e);
//		
//	}
	
//	for(Object object : list) {
//		Employee2 e = (Employee2) object;
//		System.out.println(e);
//	}
//	Iterator it = list.iterator();
//	while(it.hasNext()) {
//		System.out.println(it.next());
//	}
	
//	Employee2 e = (Employee2) list.get(0);
//	System.out.println(e.getId());
//	System.out.println(e.getName());
//	System.out.println(e.getAddress());
	
	
//	for (int i = 0; i < list.size(); i++) {
//		Employee2 e = (Employee2) list.get(i);
//		System.out.println(e);
	
//	for (Object object : list) {
//		Employee2 e = (Employee2) object;
//		System.out.println(e);
//	}
	
	Iterator it = list.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
		
	}
}

