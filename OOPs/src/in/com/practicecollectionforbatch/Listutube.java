package in.com.practicecollectionforbatch;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listutube {
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	
	list.add("shivam");
	list.add("deepak");
	list.add("rays");
	list.add("sush");
	list.add("sachin");
	list.add("sid");
	
	System.out.println(list);
	list.set(0, "ncs");
	System.out.println(list);
	
	for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
	}
	
	for(String s : list) {
		System.out.println(s);
	}
	
	Iterator<String> s = list.iterator();
	while (s.hasNext()) {
		System.out.println(s.next());
	}
}
}
