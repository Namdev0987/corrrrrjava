package in.com.threadwithdur1;

public class Practice2 {
public static void main(String[] args) {
	System.out.println("start thread");
	
	int x = 100 + 100;
	System.out.println("sum of =" + x);
	
	//Thread
	Thread t = Thread.currentThread();
	String tname = t.getName();
	System.out.println("currunt thred =" + t.getName());
	
	//setname
	t.setName("mythread");
	System.out.println(t.getName());
	
	try {
		Thread.sleep(2000);
	} catch (Exception e) {
		System.out.println(e);
	}
	System.out.println(t.getId());
	
	Userthrea1 u = new Userthrea1();
	u.start();
	
	
	System.out.println("end thread");
}
}
