package in.com.startingcollection;

import java.util.ArrayList;
import java.util.Collection;

public class Test1 {
public static void main(String[] args) {
	Collection c1 = new ArrayList();
	c1.add("a");
	c1.add(1);
	c1.add(2);
	c1.add(3);
	c1.add(4);
	System.out.println(c1);
	
	Collection c2 = new ArrayList();
	c2.add(5);
	c2.add(6);
	c2.add(7);
	c2.add(8);
	c2.add("shivam");
	System.out.println(c2);
	
	//c1.addAll(c2);
	System.out.println(c1);
	c1.remove("a");
	System.out.println(c1);
	//c1.clear();
	System.out.println(c1);
	c1.size();
	System.out.println(c1);
}
}