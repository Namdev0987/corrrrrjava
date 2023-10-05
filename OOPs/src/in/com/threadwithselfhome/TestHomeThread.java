package in.com.threadwithselfhome;

public class TestHomeThread {
public static void main(String[] args) {
	Homethread t1 = new Homethread();
	Thread tr = new Thread(t1);
	
	
	HomeThreadanother t2 = new HomeThreadanother();
	tr.start();
	t2.start();
}
}
