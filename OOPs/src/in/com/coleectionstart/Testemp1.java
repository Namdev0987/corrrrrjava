package in.com.coleectionstart;

public class Testemp1 {
public static void main(String[] args) {
	Employee1 e1 = new Employee1(1, "hard", "kota");
	
	Employee1 e2 = new Employee1(1, "hard", "kota");
	
	System.out.println(e1.equals(e2));
	
	System.out.println(e1.hashCode());
	System.out.println(e2.hashCode());
}
}
