package in.com.io1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class TestExd {
public static void main(String[] args) throws Exception {
	FileInputStream file = new FileInputStream("C:\\Users\\gagan\\Desktop\\javashree\\ors.txt");
	ObjectInputStream in = new ObjectInputStream(file);
	
	Emp1 e1 = (Emp1) in.readObject();
	System.out.println(e1.empId);
	System.out.println(e1.name);
	System.out.println(e1.salary);
	System.out.println(e1.bonus);
	System.out.println(e1.adress);
	file.close();
	in.close();
}
}
