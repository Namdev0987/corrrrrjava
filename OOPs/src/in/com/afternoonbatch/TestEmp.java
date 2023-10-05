package in.com.afternoonbatch;

public class TestEmp {
public static void main(String[] args) {
	Employee e1 = new Employee(1, "shiva", "bhopal");
	
	Employee e2 = new Employee(1, "shiva", "bhopal");
	
	System.out.println(e1.equals(e2));
	
	System.out.println(e1.hashCode());
	System.out.println(e2.hashCode());
}
}
