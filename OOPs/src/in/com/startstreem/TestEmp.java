package in.com.startstreem;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmp {
public static void main(String[] args) {
	ArrayList<Integer> marks = new ArrayList<>();
	marks.add(99);
	marks.add(89);
	marks.add(100);
	marks.add(88);
	marks.add(102);
	marks.add(78);
	
	System.out.println(marks);
	Collections.sort(marks);
	System.out.println(marks);
}
}
