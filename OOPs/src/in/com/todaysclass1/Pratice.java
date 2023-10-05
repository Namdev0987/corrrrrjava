package in.com.todaysclass1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pratice {
public static void main(String[] args) {
	List l = new ArrayList();
	l.add("harddep");
	l.add(1);
	l.add("one");
	l.add("two");
	l.add("three");
	
	System.out.println(l);
	
	Iterator it = l.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
