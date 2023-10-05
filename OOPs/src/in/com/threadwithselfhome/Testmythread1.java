package in.com.threadwithselfhome;

public class Testmythread1 {
public static void main(String[] args) {
	Mythread1 t1 = new Mythread1();
	Thread tr = new Thread(t1);
	
	MyanotherThred1 t2 = new MyanotherThred1();
	
	t2.start();
	
	tr.start();
	
	
}
}
