package in.com.thread;

public class TestRacing {
public static void main(String[] args) {
	Racing t1 = new Racing("shivam");
	Racing t2 = new Racing("namdev");
	t1.start();
	t2.start();
}
}
