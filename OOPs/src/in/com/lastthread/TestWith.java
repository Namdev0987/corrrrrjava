package in.com.lastthread;

public class TestWith {
public static void main(String[] args) {
	Withthread t1 = new Withthread("deepesh");
	Withthread t2 = new Withthread("shubham");
	
	t1.setPriority(1);
	t2.setPriority(100);
	
	t1.start();
	t2.start();
}
}
