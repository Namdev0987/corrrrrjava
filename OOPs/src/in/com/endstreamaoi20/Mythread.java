package in.com.endstreamaoi20;

public class Mythread implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 11; i++) {
			System.out.println("mythread values =" + i);
			
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
	}
}
