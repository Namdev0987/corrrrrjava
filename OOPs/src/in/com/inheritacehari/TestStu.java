package in.com.inheritacehari;

public class TestStu {
public static void main(String[] args) {
	Student s = new Student();
	s.read();
	s.read("think python");
	s.read("sunilos", 500);
	
	Employee e = new Developer();
	e.Showdetail();
	
//	Developer d = new Developer();
//	d.Showdetail();
}
}
