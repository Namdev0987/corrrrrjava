package in.com.practicecollectionforbatch;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
public static void main(String[] args) {
	Map<String, Integer>num  = new HashMap<>();
	num.put("one", 1);
	num.put("two", 2);
	num.put("three", 3);
	num.put("forth", 4);
	num.put("five", 5);
	num.put("six", 6);
	
	
	//num.putIfAbsent("six", 9);
//	if(!num.containsKey("six")) {
//		num.put("six", 9);
//	}
	
	
//	for(Map.Entry<String, Integer> e : num.entrySet()) {
//		//System.out.println(e);
//		//System.out.println(e.getKey());
//		System.out.println(e.getValue());
//	}
	System.out.println(num.containsValue(1000));
	
	
	
	System.out.println(num);
	
	
	
}
}
