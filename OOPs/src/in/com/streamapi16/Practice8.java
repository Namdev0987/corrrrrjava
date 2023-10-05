package in.com.streamapi16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice8 {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	list.add(19);
	list.add(78);
	list.add(27);
	list.add(70);
	list.add(90);
	list.add(18);
//	System.out.println(list);
//	
//	List<Integer>evenlist = new ArrayList<Integer>();
//	for (Integer i : list) {
//		if (i%2==0) {
//			evenlist.add(i);
//		}
//	}
	//System.out.println(evenlist);
	
//	Stream<Integer>stream = list.stream();
//	List<Integer>newlist = stream.filter(i->i%2==0).collect(Collectors.toList());
//	System.out.println(newlist);
//	
//	List<Integer> newlist1 = list.stream().filter(i->i%2==0).collect(Collectors.toList());
//	System.out.println(newlist1);
//	
//	List<Integer> newlist2 = list.stream().filter(e->e>50).collect(Collectors.toList());
//	System.out.println(newlist2);
	
//	List<String>name = List.of("aman","amisha","alia","arman","arjun","abhishek","arvind","shivam","suman","sushmita","hardeep");
//	List<String>newname = name.stream().filter(e->e.startsWith("a")).collect(Collectors.toList());
//	System.out.println(newname);
//	
//	List<Integer>num = List.of(2,4,6,8,10,12);
//	List<Integer>num1 = num.stream().map(e->e * e).collect(Collectors.toList());
//	System.out.println(num1);
	
//	List<Integer> num = List.of(2,2,2,4,4,4,6,6,6,6);
//	List<Integer>num1 = num.stream().distinct().collect(Collectors.toList());
//	System.out.println(num1);
}
}
