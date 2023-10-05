package in.com.practicecollectionforbatch;

public class TestPerson {
	public static void main(String[] args) {
		
//		String name1 = "admin";
//		String name2 = "admin";
//		String name3 = new String("admin");
//		
//		System.out.println(name1.equals(name3));
//		
//		System.out.println(name1 == name3);
		
		
		Person p1 = new Person(1, "dinesh", "indore");

		Person p2 = new Person(1, "dinesh", "indore");
		
		System.out.println(p1.equals(p2));
	}
}
