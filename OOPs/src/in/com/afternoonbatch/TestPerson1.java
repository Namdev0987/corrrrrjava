package in.com.afternoonbatch;

public class TestPerson1 {
public static void main(String[] args) {
	Person p1 = new Person(1, "shivam", "indore");
	
	Person p2 = new Person(2, "shivam", "indore");
	
	System.out.println(p1.equals(p2));
}
}
