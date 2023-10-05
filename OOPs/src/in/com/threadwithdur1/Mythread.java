package in.com.threadwithdur1;

public class Mythread implements Runnable{
@Override
public void run() {
	for (int i = 1; i <= 10; i++) {
		System.out.println("this is mythread value=" + i);
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
}
