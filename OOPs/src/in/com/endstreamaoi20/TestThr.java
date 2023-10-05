package in.com.endstreamaoi20;

public class TestThr {
public static void main(String[] args) {
	Mythread t1 = new Mythread();
	Thread tr = new Thread(t1);
	
	tr.start();
}
}
