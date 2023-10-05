package in.com.cloningeve;

import in.com.interface1afternoon.Shape;

public class TestShape {
public static void main(String[] args) {
	Shape s = new Shape("black",9);
	Shape s1 = new Shape();
	
	s1.setColor("red");
	s1.getBorderWidth();
	System.out.println(s.getBorderWidth());
	System.out.println(s.getcolor());
	System.out.println(s1.getcolor());
	s1.setBorderWidth(5000);
	System.out.println(s1.getBorderWidth());
	s1.setBorderWidth(1234);
	System.out.println(s1.getBorderWidth());
	
	
}
	
	
}

