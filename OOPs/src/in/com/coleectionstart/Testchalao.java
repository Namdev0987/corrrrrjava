package in.com.coleectionstart;

import java.util.ArrayList;
import java.util.Collection;

public class Testchalao {
public static void main(String[] args) {
	Collection c1 = new ArrayList();
	c1.add("hardeep");
	c1.add(9);
	c1.add(78.9);
	c1.add('a');
	c1.add("sir");
	c1.add('b');
	System.out.println(c1);
	
//	Collection c2 = new ArrayList();
//	c2.add("prachi");
//	c2.add(10);
//	c2.add(79.9);
//	c2.add('b');
//	c2.add("student");
//	c2.add('c');
//	System.out.println(c2);
//	c1.addAll(c2);
	//System.out.println(c1);
	
	c1.clear();
	System.out.println(c1);
	
}
}
