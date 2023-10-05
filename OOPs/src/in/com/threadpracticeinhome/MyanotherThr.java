package in.com.threadpracticeinhome;

public class MyanotherThr extends Thread{
	@Override
	public void run() {
		for (int i = 10; i >= 1; i--) {
			System.out.println("another thread value=" +i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
