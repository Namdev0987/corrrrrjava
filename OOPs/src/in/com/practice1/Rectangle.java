package in.com.practice1;

public class Rectangle {
	private int length;
	private int width;
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	public int getwidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void area() {
		int rArea = getLength() * getwidth();
		System.out.println("Rectangle Area ="+ rArea);
	}
}
