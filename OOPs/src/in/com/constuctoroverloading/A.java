package in.com.constuctoroverloading;

public class A {
	int a; double b; String c; //instance variable
	public A() {	//default cons
		a=100;b=45.32;c ="ankit";
	}
	
	public A(int x) {	//para const
		a = x;
	}
		
	public A(double y,String z) {
		b = y; c = z;
	}
}
