package in.com.coleectionstart;

import java.util.ArrayList;
import java.util.List;

public class Testlist1 {
public static void main(String[] args) {
	List list = new ArrayList();
	list.add("hardeep");
	list.add(7);
	list.add(10);
	list.add('b');
	list.add("one");
	list.add(5, "shivam");
	System.out.println(list.get(4));
	System.out.println(list);
	//System.out.println(list);
	
	List list1 = new ArrayList();
	list1.add(list);
	System.out.println(list1);
	
	System.out.println(list1);
}
}
