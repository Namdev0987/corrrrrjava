package in.com.threadwithdur1;

public class Pratice2 {
public static void main(String[] args) {
	System.out.println("start thread");
	
	int x = 100 + 100;
	System.out.println("sum is =" + x);
	
	Thread t = Thread.currentThread();
	String tname = t.getName();
	System.out.println("tread name =" + t.getName());
	
	t.setName("mythred");
	System.out.println(t.getName());
	
	try {
		Thread.sleep(1000);
	} catch (Exception e) {
		System.out.println(e);
	}
	
	System.out.println(t.getId());
	
	
	System.out.println("end thread");
}
}
