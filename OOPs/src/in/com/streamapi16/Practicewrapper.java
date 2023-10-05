package in.com.streamapi16;

public class Practicewrapper {
public static void main(String[] args) {
	int a = 8;
	Integer b = new Integer(a);
	System.out.println(b);
	System.out.println(a);//autoboxing
	
	//unboxing
	Integer c = new Integer(10);
	int d = c;
	System.out.println(c);
	System.out.println(d);
	
}
}
