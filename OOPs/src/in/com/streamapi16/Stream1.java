package in.com.streamapi16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {
public static void main(String[] args) {
	List<Integer>list1 = List.of(2,4,50,21,22,67);//imutable
	//list1.add(45);
	System.out.println(list1);
	
	List<Integer> list2 = new ArrayList<Integer>();
	list2.add(12);
	list2.add(34);
	list2.add(23);
	list2.add(78);
	System.out.println(list2);
	
	List<Integer>list3=Arrays.asList(23,567,12,677,24);
	//list3.add(45);
	System.out.println(list3);
	
	//withoutstream
	List<Integer>listeven = new ArrayList();
	
	for (Integer i : list1) {
		if (i % 2 == 0) {
			listeven.add(i);
		}
	}
	System.out.println(list1);
	System.out.println(listeven);
	
	//using streem api
	Stream<Integer> stream = list1.stream();
	
}
}
