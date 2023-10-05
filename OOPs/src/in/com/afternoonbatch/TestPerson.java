package in.com.afternoonbatch;

public class TestPerson {
public static void main(String[] args) {
	String name1 = "shivam";
	String name2 = "shivam";
	
	String name3 = new String("shivam");
	
	System.out.println(name1.equals(name3));
	
	System.out.println(name1 == name3);
}
}
