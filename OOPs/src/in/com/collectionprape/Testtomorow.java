package in.com.collectionprape;

import java.util.ArrayList;

public class Testtomorow {
public static void main(String[] args) {
	Testtommorrow t1 = new Testtommorrow(1, "gun", "bhopal");
	Testtommorrow t2 = new Testtommorrow(7, "hardik", "delhi");
	
	ArrayList list = new ArrayList();
	list.add(t1);
	list.add(t2);
	
	//Testtommorrow t = (Testtommorrow) list.get(0);
//	System.out.println(t.getId());
//	System.out.println(t.getName());
	
	for (int i = 0; i < list.size(); i++) {
		Testtommorrow t = (Testtommorrow) list.get(0);
		System.out.println(t);
		
	}
}
}
