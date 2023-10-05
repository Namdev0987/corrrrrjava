package in.com.startstreem;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestEmpSerialization {
public static void main(String[] args) throws Exception {
	FileOutputStream file = new FileOutputStream("C:\\Users\\gagan\\Desktop\\javashree\\emp.txt");
	ObjectOutputStream out = new ObjectOutputStream(file);
	
	Employee1 e = new Employee1();
	e.empId = 1;
	e.name = "shivam";
	e.Salary = 100000;
	e.bonus = 9000;
	e.total = e.Salary + e.bonus;
	out.writeObject(e);
	System.out.println("data converted into byte stream!!");
}
}
