package in.com.threadwithdur1;

public class Testmy {
public static void main(String[] args) {
	Mythread m = new Mythread();
	Thread tr = new Thread(m);
	
	Myanotherthread m1 = new Myanotherthread();
	
	tr.start();
	m1.start();
}
}
