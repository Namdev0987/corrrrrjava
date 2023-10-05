package in.com.threadwithselfhome;

public class MyanotherThred1 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 11; i++) {
			System.out.println("myanother thread value=" + i);
			
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
	}
}
