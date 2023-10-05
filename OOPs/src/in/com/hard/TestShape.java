package in.com.hard;

public class TestShape {
public static void main(String[] args) {
	Shape s = new Shape();
	s.area();
	s.setBorderWidth(10);
	s.setColor("black");
	System.out.println(s.getColor());
	System.out.println(s.getBorderWidth());
	
	
	Rectangle r = new Rectangle();
	
	r.setLength(10);
	r.setWidth(10);
	r.area();
	
	Shape s1 = new Rectangle();
	Rectangle r1 = (Rectangle) s1;
	r1.setLength(10);
	r1.setWidth(12);
	r1.area();
	
	
	
	
	
}
}
