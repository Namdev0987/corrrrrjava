package in.com.deamon22;

public class Backgraund extends Thread{
	String name = null;
	
	public Backgraund(String name) {
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
