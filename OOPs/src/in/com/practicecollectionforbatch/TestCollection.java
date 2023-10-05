package in.com.practicecollectionforbatch;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
public static void main(String[] args) {
	Collection c1 = new ArrayList();
	c1.add("shivam");
	c1.add(10);
	c1.add("rays");
	c1.add('a');
	c1.add(1001);
	
	Collection c2 = new ArrayList();
	c2.add(100);
	c2.add("shivam");
	c2.add("Namdev");
	c2.add(10012);
	
	System.out.println(c1);
	c1.remove("shivam");
	c1.retainAll(c2);
	System.out.println(c1);
	System.out.println(c1); 
	System.out.println(c2);
	
	c1.addAll(c2);
	System.out.println(c1);
	System.out.println(c1.contains('a'));
	System.out.println(c1.addAll(c2));
	c1.clear();
	System.out.println(c1);
	System.out.println(c1.isEmpty());
	System.out.println(c2.isEmpty());
	c1.remove("shivam");
	System.out.println(c1);
	
}
}
