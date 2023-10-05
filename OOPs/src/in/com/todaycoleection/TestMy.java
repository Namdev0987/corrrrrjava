package in.com.todaycoleection;

public class TestMy {
public static void main(String[] args) {
	MyThread t1 = new MyThread();
	Thread tr = new Thread(t1);
	
	Myanothertr t2 = new Myanothertr();
	
	tr.start();
	t2.start();
}
}
