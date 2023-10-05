package in.com.comparator1;

import java.util.ArrayList;
import java.util.Collections;

public class Practice {
public static void main(String[] args) {
	ArrayList<Integer> marks = new ArrayList();
	marks.add(100);
	marks.add(120);
	marks.add(19);
	marks.add(128);
	
	System.out.println(marks);
	Collections.sort(marks);
	System.out.println(marks);
	
}
}
