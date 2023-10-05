package in.com.thread;

public class TestWithThread {
public static void main(String[] args) {
	WithThread t1 = new WithThread("ms");
	
	t1.setPriority(1);
	
	WithThread t2 = new WithThread("dhoni");
	
	t2.setPriority(10);
	t1.start();
	t2.start();
	
	
}
}
