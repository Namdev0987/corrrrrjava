package in.com.raysdemon22;

public class Typecast {
public static void main(String[] args) {
	//byte
		//short
		//int 
		//long
		//float
		//double
	//implicit
	byte a = 10;
	double b = a;
	System.out.println(b);
	//explict
	double c = 100;
	byte d =  (byte) c;
	System.out.println(d);
	
	short e = 89;
	double f =e;
	System.out.println(f);
	
	double g = 10.0;
	short h = (short) g;
	System.out.println(h);
	
	int i = 100;
	double j = i;
	System.out.println(j);
	
	double k = 101.0;
	int l = (int) k;
	System.out.println(l);
}
	
}
