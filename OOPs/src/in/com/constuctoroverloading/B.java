package in.com.constuctoroverloading;

public class B {
	int a; double b; String c; //instance 
	public B() { //default
		a=10; b=45.56; c="shivam";
	}
	
	public B(int x) { //para const
		a = x;
	}
	
	public B(double y, String z) { // para const
		b = y ;
		c = z;
	}
}
