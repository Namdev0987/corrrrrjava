package in.com.threadwithdur1;

public class Practice3 {
public static void main(String[] args) {
	System.out.println("start program");
	int x = 100 + 100;
	System.out.println(x);
	
	Thread tr = Thread.currentThread();
	String tname = tr.getName();
	System.out.println(tname);
	
	
	tr.setName("mythread");
	System.out.println(tr.getName());
	
	try {
		Thread.sleep(1000);
	} catch (Exception e) {
		System.out.println(e);
	}
	
	System.out.println(tr.getId());
	
	System.out.println("program end");
}
}
