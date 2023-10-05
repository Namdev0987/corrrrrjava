package in.com.constuctoroverloading;

public class TestC {
	public static void main(String[] args) {
		C c = new C();
		C c2 = new C(8900);
		C c3 = new C(121.00,"ncs");
		
		System.out.println(c.a + " " +c. b + " " +c. c);
		System.out.println(c2.a);
		System.out.println(c3.b + " " + c3.c);
	}

}
