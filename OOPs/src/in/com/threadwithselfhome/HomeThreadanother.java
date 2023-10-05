package in.com.threadwithselfhome;

public class HomeThreadanother extends Thread  {
	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println("another thread value =" + i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		
		
	}
}
