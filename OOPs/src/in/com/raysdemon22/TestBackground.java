package in.com.raysdemon22;

public class TestBackground {
public static void main(String[] args) {
	Backgraoundthread t1 = new Backgraoundthread("Daemon Thread");
	
	t1.setDaemon(true);
	t1.start();
	
	for (int i = 0; i < 10; i++) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(i + "main");
	}
}
}
