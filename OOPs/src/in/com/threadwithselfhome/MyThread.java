package in.com.threadwithselfhome;

public class MyThread implements Runnable{
	@Override
	public void run() {
		// Task for thread
		for (int i = 0; i <= 10; i++) {
			System.out.println("value of i is =" + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
			
		}
		
	}
}
