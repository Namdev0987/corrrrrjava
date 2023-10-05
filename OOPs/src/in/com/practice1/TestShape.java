package in.com.practice1;

public class TestShape {
public static void main(String[] args) {
	Shape s = new Shape();
	s.area();
	
	Rectangle r = new Rectangle();
	
	r.setLength(10);
	r.setWidth(20);
	r.area();
	
	Rectangle shape = new Rectangle();
	
	Rectangle rect =(Rectangle)shape;
	
	rect.setLength(10);
	rect.setWidth(100);
	shape.area();
}
}
