package in.com.praticeallbatch;

public class Testemp {
public static void main(String[] args) {
	Employee e1 = new Employee(1, "shiva", "indore");
	Employee e2 = new Employee(1, "shiva", "indore");
	
	System.out.println(e1.equals(e2));
	System.out.println(e1.hashCode());
	System.out.println(e2.hashCode());
}
}
