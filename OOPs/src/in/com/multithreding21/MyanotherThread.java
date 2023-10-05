package in.com.multithreding21;

public class MyanotherThread extends Thread{
@Override
public void run() {
	for (int i = 10; i >= 0; i--) {
		System.out.println("myanotherthread value=" + i);
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
}
