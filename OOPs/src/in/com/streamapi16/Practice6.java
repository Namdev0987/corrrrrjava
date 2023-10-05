package in.com.streamapi16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice6 {
public static void main(String[] args) {
	List<Integer>list = new ArrayList<Integer>();
	list.add(19);
	list.add(29);
	list.add(40);
	list.add(45);
	list.add(67);
	list.add(48);
	System.out.println(list);
	
//	List<Integer>evennum = new ArrayList<Integer>();
//	for (Integer i : list) {
//		if (i % 2 == 0) {
//			evennum.add(i);
//		}
//	}
//	
//	System.out.println(evennum);
	
//	Stream<Integer>stream = list.stream();
//	List<Integer> newlist = stream.filter(i->i%2==0).collect(Collectors.toList());
//	System.out.println(newlist);
	
//	List<Integer> newlist = list.stream().filter(i->i%2==0).collect(Collectors.toList());
//	System.out.println(newlist);
	
//	List<String> name = List.of("aman","chandu","chain","chaman","chacha","hardeep");
//	List<String> newname = name.stream().filter(e->e.startsWith("c")).collect(Collectors.toList());
//	System.out.println(newname);
	
//	List<Integer>num = List.of(1,2,3,4,5,6,7);
//	List<Integer>Squre = num.stream().map(i->i*i).collect(Collectors.toList());
//	System.out.println(Squre);
	
//	List<Integer>num1 = List.of(2,3,4,2,4,2,3,2);
//	List<Integer>num2 = num1.stream().distinct().collect(Collectors.toList());
//	System.out.println(num2);
	
	
	
	
}
}
