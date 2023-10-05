package in.com.threadpracticeinhome;

import in.com.todaycoleection.Myanothertr;

public class Test {
public static void main(String[] args) {
	Mythread t1 = new Mythread();
	Thread tr = new Thread(t1);
	
	Myanothertr t2 = new Myanothertr();
	t2.start();
	tr.start();
}
}
