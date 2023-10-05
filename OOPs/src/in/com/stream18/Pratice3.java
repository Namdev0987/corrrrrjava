package in.com.stream18;

import java.util.List;
import java.util.stream.Collectors;

public class Pratice3 {
public static void main(String[] args) {
//	List<String> list = List.of("shiva","mahi","deepak","shivam","sushmita","sachin");
//	List<String>newlist = list.stream().filter(i->i.startsWith("s")).collect(Collectors.toList());
//	System.out.println(newlist);
//	
//	List<Integer> newlist1 = List.of(2,3,4,5,6,7,8);
//	List<Integer> list1 = newlist1.stream().map(e->e * e).collect(Collectors.toList());
//	System.out.println(list1);
//	
//	List<Integer>list2 = List.of(1,1,1,2,3,3,4,4,4,8);
//	List<Integer>withoutduplicate = list2.stream().distinct().collect(Collectors.toList());
//	System.out.println(withoutduplicate);
	
	
//	

//	List<Integer>list = List.of(2,3,4,5,6,7,8);
//	List<Integer>list1 = list.stream().map(i->i*i).collect(Collectors.toList());
//	System.out.println(list1);
	
	List<Integer>list = List.of(1,2,3,1,2,3,1,2,3);
	List<Integer>list1 = list.stream().distinct().collect(Collectors.toList());
	System.out.println(list1);
	
}
}
