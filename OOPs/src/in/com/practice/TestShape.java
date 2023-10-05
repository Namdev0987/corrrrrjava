package in.com.practice;

public class TestShape {

public static void main(String[] args) {
	Shape s = new Shape();
	
	Rectangle r = new Rectangle();
	
	Shape s1 = new Rectangle();
	
	Rectangle r1 = (Rectangle) s1;
	
	System.out.println(r1.getColor());
	System.out.println(r1.getBorderWidth());
	System.out.println(r1.getLength());
	
}
}
