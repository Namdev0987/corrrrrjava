package in.com.threadwithselfhome;

public class Testth2 {
public static void main(String[] args) {
	Mythread2 t1 = new Mythread2();
	Thread tr = new Thread(t1);
	
	
	MyAnothertr t2 = new MyAnothertr();
	tr.start();
	t2.start();
	
}
}
