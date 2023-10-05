package in.com.threadpracticeinhome;

public class Mythread implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 11; i++) {
			System.out.println("first thred value =" +i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
}
