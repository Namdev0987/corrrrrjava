package in.com.practicemust;

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
	
	public void area() {
		System.out.println("this is area method");
	}
}
