package in.com.raysdemon22;

public class Backgraoundthread extends Thread{
	String name = null;
	
	public Backgraoundthread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		while(true) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name);
		}
	}
}
