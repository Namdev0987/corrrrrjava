package in.com.common;

public class Shape {
	private String color = null;
	private int borderwidth = 0;
	
	public Shape() {
		
	}
	
	public Shape(String color, int borderwidth) {
		this();
		this.color = color;
		this.borderwidth = borderwidth;
		System.out.println(color);
		System.out.println(borderwidth);
	}
	
	public void setBorderWidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}
	
	public int getBorderWidth() {
		return borderwidth;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	public double area() {
		System.out.println("Shape area method!!!!!");
		return 0;
	}
}
