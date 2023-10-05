package in.com.todaycoleection;

public class Myanothertr extends Thread{
	@Override
	public void run() {
		for (int i = 10; i >= 1; i--) {
			System.out.println("another thred value =" + i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
}
