package in.com.pooly12;

public class TestStu {
public static void main(String[] args) {
	Student s  = new Student();
	s.read();
	s.read("Self lerner");
	s.read("sunilos", 500);
	
	Employee e = new Developer();   //Employee()
	e.showDetail();
	
//	Developer d = new Developer();
//	d.showDetail();
	
	
}
}
