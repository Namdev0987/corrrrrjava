package in.com.raysdemon22;

public class TestShape {
public static void main(String[] args) {
	//Shape s1 = new Shape("red", 100);
//	System.out.println(s1.getBorderWidth());
//	System.out.println(s1.getColor());
	
	Shape s2 = new Shape();
	s2.setColor("green");
	s2.setBorderWidth(1000);
	
	System.out.println(s2.getColor());
	System.out.println(s2.getBorderWidth());
}
}
