package in.com.practicebatchrevision;

public class TestPen {
public static void main(String[] args) {
	Pen p1 = new Pen();
	p1.color = "red";
	p1.type = "gel";
	p1.rate = 10;
	
	p1.write();
	p1.printColor();
	p1.printType();
	
	Pen p2 = new Pen();
	p2.color = "black";
	p2.type = "ball";
	p2.rate = 15;
	
	p2.printColor();
	p1.printColor();
	
}
}
