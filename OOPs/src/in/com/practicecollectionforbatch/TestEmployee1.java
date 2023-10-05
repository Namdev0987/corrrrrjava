package in.com.practicecollectionforbatch;
import java.util.ArrayList;
import java.util.Iterator;

public class TestEmployee1 {
	public static void main(String[] args) {

		Employee e1 = new Employee(1, "yash", "indore");

		Employee e2 = new Employee(1, "yash", "indore");
		
		System.out.println(e1.equals(e2));

		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

	}
}
