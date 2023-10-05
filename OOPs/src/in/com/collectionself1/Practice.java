package in.com.collectionself1;

import java.util.Enumeration;
import java.util.Vector;

public class Practice {
public static void main(String[] args) {
	Vector v = new Vector();
	v.add(100);
	v.add(101);
	v.add(56);
	v.add("shivam");
	System.out.println(v);
	
	Enumeration e = v.elements();
	v.add(1010);
	v.add("shiva");
	System.out.println(v);
	
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}

	
}
}
