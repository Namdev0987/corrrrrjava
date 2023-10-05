package in.com.practicemust;

public class TestShape {
	public static void main(String[] args) {
		Shape s = new Shape();
		s.setBorderWidth(10);
		s.setColor("black");
		s.area();
		
		Shape s1 = new Rectangle();
		s1.setBorderWidth(10);
		s1.setColor("green");
		
		Rectangle r = (Rectangle) s1;
		r.setLength(10);
		r.setWidth(100);
		r.area();
		
		
		
	}

}
