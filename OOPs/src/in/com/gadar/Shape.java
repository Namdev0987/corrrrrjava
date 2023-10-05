package in.com.gadar;

public class Shape {
	private String color = null;
	private int borderwidth = 0;
	
	public void getColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	public void getBorderWidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}
	public int getBorderWidth() {
		return borderwidth;
	}
	public double area() {
		System.out.println("Shape area method!!!");
		return 0;
	}
}
