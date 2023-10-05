package in.com.multithreding21;

public class Mythread implements Runnable{
@Override
public void run() {
	for (int i = 1; i < 11; i++) {
		System.out.println("mythread values =" + i);
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
}
