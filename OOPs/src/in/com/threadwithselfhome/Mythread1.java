package in.com.threadwithselfhome;

public class Mythread1 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 11; i++) {
			System.out.println("value of mythread1=" + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
	}
}
