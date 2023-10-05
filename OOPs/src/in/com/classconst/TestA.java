package in.com.classconst;

public class TestA {
public static void main(String[] args) {
	A r = new A();
	A r2 = new A(1000);
	A r3 = new A(99.99,"shivam");
	
	System.out.println(r.a + " " +r.b + " " +r. c);
	System.out.println(r2.a);
	System.out.println(r3.b + " " + r3.c);
}
}
