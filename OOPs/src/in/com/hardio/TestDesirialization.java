package in.com.hardio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class TestDesirialization {
public static void main(String[] args) throws Exception {
	FileInputStream file = new FileInputStream("C:\\\\Users\\\\gagan\\\\Desktop\\\\iohard\\\\obj.txt");
	ObjectInputStream in = new ObjectInputStream(file);
	
	Employee e = (Employee) in.readObject();
	System.out.println("EmpId =" + e.empId);
	System.out.println("NAME = " + e.name);
	System.out.println("SALARY =" + e.Salary);
	System.out.println("BONUS =" + e.bonus);
	System.out.println("TOTAL =" + e.total);
	
	file.close();
	in.close();
}
}
