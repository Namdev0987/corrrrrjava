package in.com.classconst;

public class TestB {
public static void main(String[] args) {
	B r = new B();// default
	B r2 = new B(1000);//one para 
	B r3 = new B(999.99, "prachi");// two para
	
	System.out.println(r.a + " " + r.b + " " + r.c);
	System.out.println(r2.a);
	System.out.println(r3.b + " " +r3. c);
}
}
