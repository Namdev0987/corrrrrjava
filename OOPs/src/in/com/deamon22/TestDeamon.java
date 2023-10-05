package in.com.deamon22;

public class TestDeamon {
public static void main(String[] args) {
	BackgroundThread t = new BackgroundThread("deamon thread");
	t.setDaemon(true);
	t.start();
	
	for (int i = 0; i < 10; i++) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main" + i);
	}
}
}
