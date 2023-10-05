package in.com.inheritancebatch;

public class Shape {
	
	private int borderWidth = 0;
	private String color = null;
	
	public void setBorderWidth(int boderwidth) {
		this.borderWidth = boderwidth;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	public void area() {
		System.out.println("area method");
	}
	

}
