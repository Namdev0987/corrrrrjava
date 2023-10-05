package in.com.streamapi16;

public class Wrapper1 {
public static void main(String[] args) {
	int a = 10;
	Integer b = new Integer(a);//autoboxing
	System.out.println(a);
	System.out.println(b);
	
	Integer c = new Integer(19);//unboxing
	int d = c;
	System.out.println(c);
	System.out.println(d);
}
}
