package in.com.practice;

public class Shape1{
	private String color = null;
	private int borderWidth = 0;
	
	public Shape1() {
		
	}
	public Shape1(String color ,int borderWidth) {
		this.color = color;
		this.borderWidth = borderWidth;
		
	}
	public void setColor (String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setborderWidth(int borderWidth) {
		this.borderWidth= borderWidth;
	}
	public int getborderWidth() {
		return borderWidth;
	}
}
