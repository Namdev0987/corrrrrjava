package in.com.workout;

public class Shape {
	private String color = null;
	private int borderWidth = 0;
	
	public Shape() {
		
	}
	public Shape(int borderWidth, String color) {
		this.borderWidth = borderWidth;
		this.color = color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	
	
	
}
