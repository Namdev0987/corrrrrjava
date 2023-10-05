package in.com.ppppp;

public class TestShape {
public static void main(String[] args) {
	Shape [] s = new Shape[3];
	s[0] = new Rectangle();
	s[1] = new Circle();
	s[2] = new Triangle();
	
	Rectangle r = (Rectangle) s[0];
	r.setLength(10);
	r.setWidth(20);
	
	Circle c = (Circle) s[1];
	c.setRadius(100);
	
	Triangle t = (Triangle) s[2];
	t.setBase(10);
	t.setHeight(100);
	
	double totalArea = 0;
			
	for (int i = 0; i < s.length; i++) {
		totalArea = totalArea + s[i].area();
	}
	System.out.println(totalArea);
	
}
}
