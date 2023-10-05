package in.com.common;

public class Rect extends Shape {
	private int length = 0;
	private int width = 0;
	
	public Rect() {
		
	}
	
	public Rect(int length, int width) {
		super("green" ,9);
		this.length = length;
		this.width = width;
		
	}
	public void setLength(int length) {
		this.length = length; 
	}
	
	public int getLength() {
		return length;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}
	
	@Override
	public double area() {
		int rArea = getLength() * getWidth();
		System.out.println("Rectangel area =" + rArea);
		return rArea;
	}
	
	
}
