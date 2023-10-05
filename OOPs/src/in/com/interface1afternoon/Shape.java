package in.com.interface1afternoon;

public class Shape {
	private String color = null;
	private int borderWidth = 0;
	
	
	public Shape() {
		
	}
	
	public Shape( String color,int borderWidth) {
		this.color = color;
		this.borderWidth = borderWidth;
	}
	
	public void setColor (String color) {
		this.color = color;
	}
	public String getcolor() {
		return color;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	

}
