package in.com.todaysclass1;

import java.util.Enumeration;
import java.util.Vector;

public class Pratice2 {
public static void main(String[] args) {
	Vector v = new Vector();
	v.add("one");
	v.add(1);
	v.add(2);
	v.add(3);
	v.add(4);
	v.add("five");
	
	System.out.println(v);
	
	Enumeration e = v.elements();
	v.add("hardeep");
	v.add("shuvam");
	v.add("three");
	System.out.println(v);
	
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
}
}
