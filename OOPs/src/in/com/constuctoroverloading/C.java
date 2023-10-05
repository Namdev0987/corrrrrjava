package in.com.constuctoroverloading;

public class C {
	
	int a ; double b ; String c;
	public C() {
		a = 199; b = 78.99; c = "rays";
	}
	
	public C(int x) {
		a = x;
	}
	
	public C(double y, String z) {
		b = y ;
		c = z;
	}
}
