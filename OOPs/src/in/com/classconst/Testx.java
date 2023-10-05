package in.com.classconst;

public class Testx {
public static void main(String[] args) {
	X r = new X();
	X r1 = new X(1000);
	X r2 = new X(999.99,"indore");
	
	System.out.println(r.a + " " + r.b + " " + r.c );
	System.out.println(r1.a);
	System.out.println(r2.b +" " + r2.c);
}
}
