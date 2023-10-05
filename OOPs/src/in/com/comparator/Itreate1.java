package in.com.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Itreate1 {
public static void main(String[] args) {
	Collection c1 = new ArrayList();
	c1.add("shivam");
	c1.add("namdev");
	c1.add("python");
	c1.add("java");
	c1.add("html");
	c1.add("css");
	
	//System.out.println(c1);
	
	Iterator it = c1.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	

}
}
