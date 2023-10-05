package in.com.inheritacehari;

public class Student {
	public void read() {
		System.out.println("Student reading book");
	}
	
	public void read(String book) {
		System.out.println("Student reading " + book);
	}
	
	public void read(String writer ,int rate) {
		System.out.println(writer);
		System.out.println(rate);
	}
}
