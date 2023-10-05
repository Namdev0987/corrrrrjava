package in.com.streamapi16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {
public static void main(String[] args) {
//	List<Integer>l1 = new ArrayList();
//	l1.add(20);
//	l1.add(19);
//	l1.add(22);
//	l1.add(23);
//	l1.add(24);
//	l1.add(30);
//	l1.add(45);
//	//System.out.println(l1);
//	
//	List<Integer> listeven = new ArrayList();
//	for (Integer i : l1) {
//		if (i % 2 == 0) {
//			listeven.add(i);
//		}
//	}
//	System.out.println(l1);
//	System.out.println(listeven);
	
//	List<Integer> list1 = new ArrayList();
//	list1.add(12);
//	list1.add(20);
//	list1.add(13);
//	list1.add(15);
//	list1.add(44);
//	list1.add(50);
//	System.out.println(list1);
//	
//	List<Integer> listeven = new ArrayList();
//	for (Integer i : list1) {
//		if (i % 2 ==0) {
//			listeven.add(i);
//		}
//	}
//	System.out.println(listeven);
	
	
//	List<Integer> list1 = new ArrayList();
//	list1.add(12);
//	list1.add(13);
//	list1.add(45);
//	list1.add(34);
//	list1.add(50);
//	System.out.println(list1);
//	
//	List<Integer> listeven = new ArrayList();
//	for (Integer i: list1) {
//		if (i % 2 == 0) {
//			listeven.add(i);
//		}
//	}
//	System.out.println(listeven);
	
	List<Integer> l1 = new ArrayList();
	l1.add(23);
	l1.add(22);
	l1.add(24);
	l1.add(56);
	l1.add(45);
	l1.add(50);
	l1.add(56);
	System.out.println(l1);
	
	List<Integer> listeven = new ArrayList<Integer>();
	
	for (Integer i : l1) {
		if (i % 2 == 0) {
			listeven.add(i);
		}
	}
	System.out.println(listeven);
	
//	Stream<Integer> stream = l1.stream();
//	List<Integer>newlist =stream.filter(i->i%2==0).collect(Collectors.toList());
//	System.out.println(newlist);
	
	Stream<Integer>stream = l1.stream();
	List<Integer>newlist = stream.filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(newlist);
}
}
