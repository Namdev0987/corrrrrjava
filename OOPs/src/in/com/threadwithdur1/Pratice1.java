package in.com.threadwithdur1;

public class Pratice1 {
public static void main(String[] args) {
	System.out.println("program start");
	int x = 100+100;
	System.out.println("sum is=" + x);
	
	//thread
	Thread t = Thread.currentThread();
	String tname = t.getName();
	System.out.println("currunt thread =" +tname);
	
	//setname
	t.setName("mymain");
	System.out.println(t.getName());
	
	try {
		Thread.sleep(2000);
	} catch (Exception e) {
		System.out.println(e);
	}
	
	System.out.println(t.getId());
	
	Userdefine u = new Userdefine();
	u.start();
	
	
	System.out.println("program end");
}
}
