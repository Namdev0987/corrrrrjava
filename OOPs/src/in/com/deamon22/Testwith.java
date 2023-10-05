package in.com.deamon22;

public class Testwith {
public static void main(String[] args) {
	WithThread t1 = new WithThread("raju");
	WithThread t2 = new WithThread("tenua");
	
	t1.setPriority(9);
	t2.setPriority(5);
	
	t1.start();
	t2.start();
	
}
}
