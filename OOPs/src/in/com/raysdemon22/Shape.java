package in.com.raysdemon22;

public class Shape {
	String color = null;
	int borderwidth = 0;
	
//	public Shape(String color,int borderwidth) {
//		this.color = color;
//		this.borderwidth = borderwidth;
//	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setBorderWidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}
	
	public int getBorderWidth() {
		return borderwidth;
	}
}
