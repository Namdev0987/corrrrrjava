package in.com.streamapi16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice1 {
public static void main(String[] args)  {
	List<Integer> l1 = new ArrayList<Integer>();
	l1.add(100);
	l1.add(200);
	l1.add(300);
	l1.add(123);
	l1.add(46);
	l1.add(9);
	l1.add(79);
	System.out.println(l1);
	
	List<Integer> listeven = new ArrayList<Integer>();
	for (Integer i : l1) {
		if(i % 2 == 0) {
			listeven.add(i);
		}
	}
	System.out.println(l1);
	System.out.println(listeven);
	
//	Stream<Integer> stream = l1.stream();
//	List<Integer> newlist = stream.filter(i -> i%2==0).collect(Collectors.toList());
//	System.out.println(newlist);
	
	List<Integer> newlist = l1.stream().filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(newlist);
	
	List<Integer>newlist1 = l1.stream().filter(i->i >50).collect(Collectors.toList());
	System.out.println(newlist1);
	
	
	
	
}
}
