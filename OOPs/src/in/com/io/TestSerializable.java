package in.com.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerializable {
public static void main(String[] args)throws Exception {
	Marksheet m = new Marksheet();
	m.id = 1;
	m.name = "shivam";
	m.phyjics = 75;
	m.chemistry = 88;
	m.maths = 100;
	m.total = m.phyjics + m.chemistry + m.maths;
	
	
	FileOutputStream file = new FileOutputStream("C:\\Users\\gagan\\Desktop\\fileread\\obj.txt");
	ObjectOutputStream out = new ObjectOutputStream(file);
	
	out.writeObject(m);
	out.close();
	file.close();
	
	System.out.println("obj write succeesfully");
}
}
