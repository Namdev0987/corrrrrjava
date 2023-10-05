package in.com.lastthread;

public class Withthread extends Thread{
	String name = null;
	
	public Withthread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + name);
		}
	}
	
}
