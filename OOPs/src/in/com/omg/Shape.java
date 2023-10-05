package in.com.omg;

public class Shape {
	private int borderwidth = 0;
	private String color = null;
	
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
		System.out.println("this is area method");
		return area();
	}
}
