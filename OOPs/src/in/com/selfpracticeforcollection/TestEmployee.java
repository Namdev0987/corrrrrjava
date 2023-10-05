package in.com.selfpracticeforcollection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestEmployee {
public static void main(String[] args) {
	Employee e1 = new Employee(1,"shivam","bhopal");
	
	Employee e2 = new Employee(2, "rays", "indore");
	
	ArrayList list = new ArrayList();
	list.add(e1);
	//list.add(e2);
	
	//System.out.println(e1);
	//System.out.println(e2);
	
//	Employee e = (Employee) list.get(0);
//	System.out.println(e.getId());
//	System.out.println(e.getAddress());
//	System.out.println(e.getName());
	
//	for (int i = 0; i < list.size(); i++) {
//		System.out.println(list.get(i));
//	}
	
//	for(Object o : list) {
//		Employee e = (Employee) o;
//		System.out.println(e);
//	}
	
	Iterator it = list.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
