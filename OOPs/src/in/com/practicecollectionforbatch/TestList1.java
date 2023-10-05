package in.com.practicecollectionforbatch;

import java.util.ArrayList;
import java.util.List;

public class TestList1 {
public static void main(String[] args) {
	List l1 = new ArrayList();
//	l1.add("shivam");
//	l1.add(101);
//	l1.add("Rays");
//	l1.add(101);
//	l1.add(0, "india");
//	System.out.println(l1);
//	List l2 = new ArrayList();
//	l1.add(2, "mahadevs");
//	l2.add("ncs");
//	l2.add("html");
//	l2.add("css");
//	l2.add("java");
//	System.out.println(l2);
//	l1.addAll(l2);
//	System.out.println(l1);
//	l1.get(0);
//	System.out.println(l1);
//	System.out.println(l1.get(4));
//	System.out.println(l1.remove(0));
//	System.out.println(l1);
//	System.out.println(l1.set(3, "mahakal"));
//	System.out.println(l1);
	
	l1.add("bhole");
	l1.add(124);
	l1.add('b');
	l1.add(12);
	l1.add(90);
	//System.out.println(l1);
	//System.out.println(l1.set(1, "mahadev"));
	//System.out.println(l1);
	System.out.println(l1.subList(0, 5));
	System.out.println(l1.indexOf(124));
	System.out.println(l1.lastIndexOf(12));
}
}
