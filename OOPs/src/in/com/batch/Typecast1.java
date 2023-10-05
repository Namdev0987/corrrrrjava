package in.com.batch;

public class Typecast1 {
	// winding chote ko bade m byy compiler , narrowing bde ko chote m convert 
	// chote = byte short char int long float double
	public static void main(String[] args) {
		//byte b = 5;
		//double d = b;  //deciml value
		//System.out.println(b);
		//System.out.println(d);
		//double d = 5.0;
		//int b =  (int) d;
		//System.out.println(d);
		//System.out.println(b);
		//long a = 678333;
		//byte b = (byte) a;
		//System.out.println(a);
		//System.out.println(b);
		//short s = 8;
		//double d = s;
		//System.out.println(d);
		// byte short int long float double
		
		
		
		
		//chote ko bade m
		//byte b = 100;
		//short s = b; // implicite
		//long l = s;
		//int i = s;
		//float f = i;
		//double d = f;
		//System.out.println(b);
		//System.out.println(l);
		//System.out.println(i);
		//System.out.println(f);
		//System.out.println(d);
		
		// bade ko chote m
		double d = 100;
		int i = (int) d;
		System.out.println(d);
		
		
		
		
		
		
	}
}
