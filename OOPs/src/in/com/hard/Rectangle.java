package in.com.hard;

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
	
	
	public void area() {
		int rArea = getLength() * getWidth();
		System.out.println("Rectangle Area =" + rArea);
	}

}
