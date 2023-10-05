package in.com.ppppp;

public class Rectangle extends Shape{
	private int width = 0;
	private int length = 0;
	
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public double area() {
		double rArea = getLength() * getWidth();
		System.out.println("Rectangel area =" + rArea);
		return rArea;
	}

}
