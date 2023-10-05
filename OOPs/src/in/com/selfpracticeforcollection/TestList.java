package in.com.selfpracticeforcollection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {
public static void main(String[] args) {
	List list = new ArrayList();
	list.add("one");
	list.add(1);
	
	Iterator it = list.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
		
	}
	
}
}
