package in.com.practiceoopbatch;

import in.com.inheritancebatch.Rectangle;
import in.com.inheritancebatch.Shape;


public class TestShape {
	public static void main(String[] args) {
		
		
		Rectangle r1 = new Rectangle();
		r1.setBorderWidth(12);
		r1.setColor("red");
		r1.setLength(12);
		r1.setWidth(23);
		
		System.out.println(r1.getBorederWidth());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength());
		System.out.println(r1.getWidth());
				
	}
}
