package in.com.stratoopsforbatch;

public class TestPerson {
public static void main(String[] args) {
	Person p = new Person();
	Person p1 = new Person();
	
	
	p.setName("Shivam");
	p.setAddress("indore");
	p.setDateOfBirth("7/11/99");
	p1.setName("hardeep");
	
	
	System.out.println("Name:" + p.getName());
	System.out.println("Adress:"+ p.getAddress());
	System.out.println("DateofBirth:" + p.getDateOfBirth());
	System.out.println(p1.getName());
	
	
}
}
