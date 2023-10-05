package in.com.poolyhard;

public class Student {
	public void read() {
		System.out.println("student reading this book");
	}
	
	public void read(String Bookname) {
		System.out.println(Bookname);
	}
	
	public void read(String writer,int rate) {
		System.out.println(writer);
		System.out.println(rate);
	}
}
