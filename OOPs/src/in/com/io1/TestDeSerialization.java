package in.com.io1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class TestDeSerialization {

public static void main(String[] args) throws Exception {
	FileInputStream file = new FileInputStream("C:\\Users\\gagan\\Desktop\\javashree\\ExtObj.txt");
	ObjectInputStream in = new ObjectInputStream(file);
	
	Employee e = (Employee) in.readObject();
	System.out.println("id =" + e.id);
	System.out.println("name = " + e.name);
	System.out.println("adress=" + e.address);
	System.out.println("salary=" + e.salary);
	
	in.close();
	file.close();
}
}
