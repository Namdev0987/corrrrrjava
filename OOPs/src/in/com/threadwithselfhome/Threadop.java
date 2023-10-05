package in.com.threadwithselfhome;

public class Threadop {
public static void main(String[] args) {
	System.out.println("program started");
	
	int x = 56+34;
	System.out.println("sum is =" + x);
	
	//Thread....
	Thread t=Thread.currentThread();
	String tname=t.getName();
	System.out.println("currunt runniing thred is ="  + tname);
	
	//setName
	t.setName("myname");
	System.out.println(t.getName());
	
	try {
		Thread.sleep(2000);
	} catch (Exception e) {
		System.out.println(e);
	}
	
	System.out.println(t.getId());
	//going to start userdefine thread
	
	UserThread thread = new UserThread();
	thread.start();
	System.out.println("program ended");
	
	
}
}
