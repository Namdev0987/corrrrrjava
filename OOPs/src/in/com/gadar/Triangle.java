package in.com.gadar;

public class Triangle extends Shape{
	private int base = 0;
	private int heigth = 0;
	
	public void setBase(int base) {
		this.base = base;
	}
	public int getBase() {
		return base;
	}
	
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	
	public int getHeigth() {
		return heigth;
	}
	
	public double area() {
		int tArea = (getBase() * getHeigth()) / 2;
		System.out.println("Tringle Area = " + tArea);
		return tArea;
	}
}
