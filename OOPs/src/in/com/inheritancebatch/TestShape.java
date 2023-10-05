package in.com.inheritancebatch;

public class TestShape {
public static void main(String[] args) {
	Shape s = new Shape();
	s.area();
	
	
	Rectangel r = new Rectangel();
	r.setLength(10);
	r.setwidth(80);
	r.area();
	
	Shape s1 = new Rectangel();
	s1.area();
	r.area();
	s1.setBorderWidth(909);
	
	
	Rectangel rect =  (Rectangel) s1;
	rect.setLength(10);
	rect.setwidth(100);
	rect.area();
	r.area();
	s.area();
	
	
}
}
