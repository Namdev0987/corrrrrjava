package in.com.inheritance2;

public class TestShape {
public static void main(String[] args) {
	Shape [] s = new Shape[2];
	s[0] = new Rectangle();
	s[1] = new Circle();
	
	Rectangle r = (Rectangle) s[0];
	r.setLength(10);
	r.setWidth(10);
	r.area();
	
}
}
