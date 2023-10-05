package in.com.threadwithselfhome;

public class Mythread2 implements Runnable{
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Value of i is" + i);
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
		}
		
	}
}
