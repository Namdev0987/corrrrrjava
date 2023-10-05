package in.com.constuctoroverloading;

public class TestA {
public static void main(String[] args) {
	A r = new A();
	A r2 = new A(10);
	A r3 = new A(23.89,"abhi");
	
	System.out.println(r.a + " " +r.b + " " +r. c);
	System.out.println(r2.a );
	System.out.println(r3.b + " " +r3. c);
	
}
}
