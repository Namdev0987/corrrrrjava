package in.com.endstreamaoi20;

import java.util.List;
import java.util.stream.Collectors;

public class Start {
public static void main(String[] args) {
//	List<String> name = List.of("hardeep","shuvam","shiva","sachin","sweta","simmi","harleen");
//	List<String>newname =name.stream().filter(e->e.startsWith("s")).collect(Collectors.toList());
//	System.out.println(name);
//	System.out.println(newname);
//	
//	List<Integer> list = List.of(2,3,4,5,5,6);
//	List<Integer> list1 = list.stream().filter(i->i % 2 == 0).collect(Collectors.toList());
//	System.out.println(list);
//	System.out.println(list1);
//	
//	List<Integer> list2 = List.of(1,2,3,4,5,6,7,8,9,10);
//	List<Integer> list3 = list2.stream().map(i -> i * i).collect(Collectors.toList());
//	System.out.println(list2);
//	System.out.println(list3);
	
	
	List<Integer> list4 = List.of(1,1,2,2,3,4,5,5);
	List<Integer> list5 = list4.stream().distinct().collect(Collectors.toList());
	System.out.println(list4);
	System.out.println(list5);
	
	
}
}
