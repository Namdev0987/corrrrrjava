package in.com.io1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestEXtSerialization {
public static void main(String[] args) throws Exception {
	FileOutputStream file = new FileOutputStream("C:\\Users\\gagan\\Desktop\\javashree\\ExtObj.txt");
	ObjectOutputStream out = new ObjectOutputStream(file);
	
	Employee e = new Employee();
	e.id = 1;
	e.name = "shiv";
	e.address = "indore";
	e.salary = 39900;
	
	out.writeObject(e);
	out.close();
	file.close();
	System.out.println("object write successfully!!!1");
}
}
