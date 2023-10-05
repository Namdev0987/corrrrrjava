package in.com.workout;

public class TestShape {
	public static void main(String[] args) {
		Shape s = new Shape(90, "blue");
		System.out.println(s.getColor());
		s.setColor("yellow");

		System.out.println(s.getColor());
		System.out.println(s.getBorderWidth());

	}
}
