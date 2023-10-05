package in.com.streamapi16;

import java.util.List;
import java.util.stream.Collectors;

public class Practice4 {
public static void main(String[] args) {
	
	List<String> name = List.of("shiv","shanu","sahdev","sarvan","aman","hardeep","shuvham","sachin");
	List<String> names = name.stream().filter(e->e.startsWith("s")).collect(Collectors.toList());
	System.out.println(names);
	
	List<Integer> num = List.of(2,4,6,6,9,1,3);
	List<Integer> square = num.stream().map(i-> i * i).collect(Collectors.toList());
	System.out.println(square);
	
	
	
	
	
	
	
}
}
