package in.com.threadwithselfhome;

public class Testmythread {
public static void main(String[] args) {
	MyThread t1 = new MyThread();
	
	Thread thr = new Thread(t1);
	thr.start();
}
}
