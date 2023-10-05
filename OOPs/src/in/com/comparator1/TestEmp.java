package in.com.comparator1;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmp {
public static void main(String[] args) {
	ArrayList<Integer> marks = new ArrayList<>();
	marks.add(100);
	marks.add(30);
	marks.add(40);
	marks.add(15);
	marks.add(67);
	System.out.println(marks);
	Collections.sort(marks);
	System.out.println(marks);
}
}
