package in.com.pooly12;

public class Student {
	public void read() {// compile time poolly  
		System.out.println("Student reading book");
	}
	
	public void read(String bookName) {
		System.out.println("student reading book" + bookName);
	}
	
	public void read(String writer,int rate) {
		System.out.println(writer);
		System.out.println(rate);
	}
	
	
}
