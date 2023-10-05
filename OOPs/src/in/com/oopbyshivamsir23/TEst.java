package in.com.oopbyshivamsir23;

public class TEst {
public static void main(String[] args) {
	//complitime  overloading
	Student s = new Student();
	//s.read();
	s.read("think java");
	
	//runtime pooly
	Person p = new Emp();  //person
//	p.showDetail();
	
	Ram r = new Ram();
	r.doWork(p);
}
}
