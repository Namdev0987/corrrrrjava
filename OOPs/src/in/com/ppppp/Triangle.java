package in.com.ppppp;

public class Triangle extends Shape{
	private int base = 0;
	private int height = 0;
	
	
	public void setBase(int base) {
		this.base = base;
	}
	public int getBase() {
		return base;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeigth() {
		return height;
	}
	
	public double area() {
		int tArea = (getBase() * getHeigth()) /2;
		System.out.println("Triangle area = " + tArea);
		return tArea;
	}
}
