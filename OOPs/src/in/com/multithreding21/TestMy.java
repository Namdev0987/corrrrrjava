package in.com.multithreding21;

public class TestMy {
public static void main(String[] args) {
	Mythread my = new Mythread();
	
	Thread tr = new Thread(my);
	
	MyanotherThread m1 = new MyanotherThread();
	
	tr.start();
	m1.start();
}
}
