package in.com.streamapi16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice3 {
public static void main(String[] args) {
	List<Integer> list1 = new ArrayList<Integer>();
	list1.add(22);
	list1.add(56);
	list1.add(44);
	list1.add(78);
	list1.add(100);
	list1.add(70);
	list1.add(31);
	list1.add(9);
	list1.add(6);
	list1.add(0);
	
	
//	List<Integer>listeven = new ArrayList();
//	for (Integer i : list1) {
//		if (i % 2 == 0) {
//			listeven.add(i);
//		}
//	}
	
	
	System.out.println(list1);
	//System.out.println(listeven);
	
//	Stream<Integer>stream = list1.stream();
//	List<Integer> newlist = stream.filter(i -> i % 2==0).collect(Collectors.toList());
//	System.out.println(newlist);
	
//	Stream<Integer>stream = list1.stream();
//	List<Integer>newlist = stream.filter(i->i%2==0).collect(Collectors.toList());
//	System.out.println(newlist);
	
	
//	Stream<Integer>stream = list1.stream();
//	List<Integer>newlist = stream.filter(i->i%2==0).collect(Collectors.toList());
//	System.out.println(newlist);
	
	//List<Integer>newlist=list1.stream().filter(i->i%2==0).collect(Collectors.toList());
	
//	List<Integer>evenlist =new ArrayList<Integer>();
//	for (Integer i : list1) {
//		if (i % 2 == 0) {
//			evenlist.add(i);
//		}
//	}
//	//System.out.println(list1);
//	System.out.println(evenlist);
	
//	Stream<Integer>stream = list1.stream();
//	List<Integer> newlist = stream.filter(i->i%2==0).collect(Collectors.toList());
//	System.out.println(newlist);
	
//	List<Integer>newlist=list1.stream().filter(i->i%2==0).collect(Collectors.toList());
//	System.out.println(newlist);
	
	List<Integer>newlist = list1.stream().filter(i->i>10).collect(Collectors.toList());
	System.out.println(newlist);
	

}
}
