package in.com.inheritance2;

public class Shape {
	private String color = null;
	private int borderWidth =0;
	
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
	
	public void area() {
		System.out.println("This is shape area method");
	}
}
