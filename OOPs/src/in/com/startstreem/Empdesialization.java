package in.com.startstreem;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class Empdesialization {
public static void main(String[] args) throws Exception {
	FileInputStream file = new FileInputStream("C:\\Users\\gagan\\Desktop\\javashree\\emp.txt");
	ObjectInputStream in = new ObjectInputStream(file);
	
	Employee1 e = (Employee1) in.readObject();
	
	System.out.println("EmpID =" +e.empId);
	System.out.println("NAMe =" + e.name);
	System.out.println("Salary =" + e.Salary);
	System.out.println("Bonus=" + e.bonus);
	System.out.println("Total salary =" + e.total);
	file.close();
	in.close(); 
}
}
