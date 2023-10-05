package in.com.threadwithselfhome;

public class UserThread extends Thread{
	@Override
	public void run() {
		//task for thread
		System.out.println("this is user define thread!!!");
	}
}
