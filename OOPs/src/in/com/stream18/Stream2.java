package in.com.stream18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2 {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	list.add(20);
	list.add(21);
	list.add(22);
	list.add(55);
	list.add(50);
	list.add(52);
	//System.out.println(list);
//	
//	List<Integer>evenlist = new ArrayList<Integer>();
//	for (Integer i : list) {
//		if (i % 2 == 0) {
//			evenlist.add(i);
//		}
//	}
//	System.out.println(list);
//	System.out.println(evenlist);
	
	
//	Stream<Integer> stream = list.stream();
//	List<Integer> newlist = stream.filter(i->i%2==0).collect(Collectors.toList());
//	System.out.println(newlist);
	
	Stream<Integer> stream = list.stream();
	List<Integer> newlist1 = stream.filter(e -> e>50).collect(Collectors.toList());
	System.out.println(newlist1);
	
	
}
}
