package in.com.common;

public class TestShape {
public static void main(String[] args) {
	Shape s = new Shape();

	//System.out.println(s.getBorderWidth());
	//System.out.println(s.getColor());
	
	Rect r = new Rect(10,12);
	System.out.println(r.area());
}
}
