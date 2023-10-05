package in.com.poolyhard;

public class TestPen {
public static void main(String[] args) {
	Pen p = new Pen();
	p.color = "red";
	p.type = "ball";
	p.price = 20;
	
	p.PrintColor();
	p.printType();
	p.printPrice();
	
	Pen p1 = new Pen();
	p1.color = "black";
	p1.type = "gell";
	p1.price = 25;
	
	p1.PrintColor();
	p1.printType();
	p1.printPrice();
	
	
	
	
}
}
