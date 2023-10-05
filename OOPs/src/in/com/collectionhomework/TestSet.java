package in.com.collectionhomework;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
public static void main(String[] args) {
	Set s1 = new HashSet();
	s1.add(1);
	s1.add("one");
	s1.add("neeraj");
	s1.add(1);
	s1.add(null);
	s1.add(null);
	
	System.out.println(s1);
}
}
