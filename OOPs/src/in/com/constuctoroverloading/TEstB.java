package in.com.constuctoroverloading;

public class TEstB {
public static void main(String[] args) {
	B r = new B();
	B r1 = new B(100);
	B r2 = new B(89.90, "ankit");
	
	//System.out.println(r.a + "" +r. b +" " +r. c );
	System.out.println(r.a + " " +r.b + " " +r. c);
	System.out.println(r1.a);
	System.out.println(r2.b + " " + r2.c);
}
}
