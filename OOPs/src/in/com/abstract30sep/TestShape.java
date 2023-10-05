package in.com.abstract30sep;

public class TestShape {
public static void main(String[] args) {
	Rectangle r = new Rectangle() {
		
		@Override
		public void areacheck() {
			System.out.println("This is areacheck metod of Rectangle!!!");
			
		}
	};
	r.area();
	r.hello();
	r.areacheck();
	
	Shape s = new Shape() {
		
		@Override
		public void area() {
			System.out.println("this is Shape area!!!");
			
		}
	};
	s.hello();
	s.area();
	
	Circle c = new Circle() {
		
		@Override
		public void area() {
			System.out.println("Shape area mehtod Circle!!!");
			
		}
		
		@Override
		public void radius() {
			System.out.println("Radius");
			
		}
	};
	c.area();
	c.radius();
}
}
