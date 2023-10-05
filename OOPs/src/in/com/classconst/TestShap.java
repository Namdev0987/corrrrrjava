package in.com.classconst;

public class TestShap {
public static void main(String[] args) {
	Shape s = new Shape();
	s.setBorderWidth(100);
	s.setColor("blue");
	
	System.out.println(s.getBorderWidth());
	System.out.println(s.getColor());
}
}
