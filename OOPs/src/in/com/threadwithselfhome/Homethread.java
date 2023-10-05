package in.com.threadwithselfhome;

public class Homethread implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 11; i++) {
			System.out.println("home thread values =" + i);
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
	}
}
