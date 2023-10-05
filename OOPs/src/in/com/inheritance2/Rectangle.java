package in.com.inheritance2;

public class Rectangle extends Shape{
	private int length;
	private int width;
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getwidth() {
		return width;
	}
	
	public void area() {
		int rArea = getLength() * getwidth();
		System.out.println("REctangle Area =" + rArea);
	}
}
