package in.com.io1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EmpExters {
public static void main(String[] args) throws Exception {
	FileOutputStream file = new FileOutputStream("C:\\Users\\gagan\\Desktop\\javashree\\ors.txt");
	ObjectOutputStream out = new ObjectOutputStream(file);
	
	
	Emp1 e1 = new Emp1();
	e1.empId = 10;
	e1.name = "shiva";
	e1.salary = 1090;
	e1.bonus = 90;
	e1.adress = "indoree";
	
	out.writeObject(e1);
	System.out.println("done");
	file.close();
	out.close();
}
}
