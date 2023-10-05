package in.com.threadwithdur1;

public class Myanotherthread extends Thread{
@Override
public void run() {
	for (int i = 10; i > 0; i--) {
		System.out.println("myanother value=" + i);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
}
