package in.com.practicebatchrevision;

public class A {
	private int value;//data hiding
	
	public void setValue(int x) {//data abs
		value = x;
	}
	
	public int getValue() {
		return ++value;
	}
	
}
