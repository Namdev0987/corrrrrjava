package in.com.deamon22;

public class TestDemaon {
public static void main(String[] args) {
	Backgraund t1 = new Backgraund("deamon thread");
	t1.setDaemon(true);
	t1.start();
	
	for (int i = 0; i < 10; i++) {
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(i + "main");
	}
}
}
