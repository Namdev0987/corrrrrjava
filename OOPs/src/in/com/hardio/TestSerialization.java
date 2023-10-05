package in.com.hardio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {
public static void main(String[] args) throws Exception {
	FileOutputStream file = new FileOutputStream("C:\\Users\\gagan\\Desktop\\iohard\\obj.txt");
	ObjectOutputStream out = new ObjectOutputStream(file);
	
	
	Employee e = new Employee();
	e.empId = 1;
	e.name = "hardeep";
	e.Salary = 10000;
	e.bonus = 2000;
	e.total = e.Salary + e.bonus;
	
	
	out.writeObject(e);
	file.close();
	out.close();
	System.out.println("obj converted into byte stream!!!");
}
}
