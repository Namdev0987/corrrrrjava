package in.com.todaysclass;

import java.util.ArrayList;
import java.util.Collections;

import in.com.startio.practice;

public class PraticeTest {
public static void main(String[] args) {
	ArrayList<Pratcie> p1 = new ArrayList();
	p1.add(new Pratcie(1, "shivam"));
	p1.add(new Pratcie(3, "ghh"));
	p1.add(new Pratcie(0, "dd"));
	
	System.out.println(p1);
	
	Collections.sort(p1);
	System.out.println(p1);
}
}
