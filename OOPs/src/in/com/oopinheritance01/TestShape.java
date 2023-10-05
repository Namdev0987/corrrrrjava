package in.com.oopinheritance01;

public class TestShape {
public static void main(String[] args) {
	Shape s = new Shape();
	s.setColor("green");
	s.setBorderWidth(100);
	
	System.out.println(s.getColor());
	System.out.println(s.getBorderWidth());
	
	
	
	
	Rectangle r = new Rectangle();
	r.setLength(8);
	r.setWidth(10);
	r.setBorderWidth(89);
	r.setColor("black");
	
	System.out.println(r.getLength());
	System.out.println(r.getWidth());
	System.out.println(r.getBorderWidth());
	System.out.println(r.getColor());
	
}
}
