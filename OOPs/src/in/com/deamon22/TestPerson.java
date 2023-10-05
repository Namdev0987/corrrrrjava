package in.com.deamon22;

public class TestPerson {
public static void main(String[] args) {
	Person p = new Person();
	p.setName("prachi");
	p.setDob(12);
	p.setAddress("indore");
	
	System.out.println(p.getName());
	System.out.println(p.getDob());
	System.out.println(p.getAddress());
}
}
