package in.com.selfpracticeforcollection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
public static void main(String[] args) {
	Collection c1 = new ArrayList();
	c1.add(10);
	c1.add("shivam");
	c1.add("rays");
	c1.add(100);
	System.out.println(c1);
	
	Collection c2 = new ArrayList();
	c2.add(1001);
	c2.add("ram");
	c2.add("sami");
	c2.add("ms");
	c2.add("kohli");
	
	System.out.println(c2);
	
	c1.addAll(c2);
	System.out.println(c1);
	System.out.println(c1.containsAll(c2));
	System.out.println(c1.contains("ram"));
	//c1.clear();
	System.out.println(c1);
	c1.remove("shivam");
	System.out.println(c1);
}
}
