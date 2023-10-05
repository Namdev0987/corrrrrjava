package in.com.classconst;

public class Shape {
	private int borderwidth ;  //data hiding
	private String color;
	
	public void setBorderWidth(int borderwidth) { //
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
}
