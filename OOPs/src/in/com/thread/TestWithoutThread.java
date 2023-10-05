package in.com.thread;

public class TestWithoutThread {
public static void main(String[] args) {
	WithoutThread t1 = new WithoutThread("shivam");
	WithoutThread t2 = new WithoutThread("namdev");
	
	t1.run();
	t2.run();
}
}
