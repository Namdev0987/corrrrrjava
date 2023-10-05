package in.com.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestDeserialization {
public static void main(String[] args)throws Exception {
	FileInputStream file = new FileInputStream("C:\\Users\\gagan\\Desktop\\fileread\\obj.txt");
	ObjectInputStream in = new ObjectInputStream(file);
	Object o = in.readObject();
	Marksheet m = (Marksheet) o;
	
	System.out.println(m.id);
	System.out.println(m.name);
	System.out.println(m.phyjics);
	System.out.println(m.chemistry);
	System.out.println(m.total);
	
	in.close();
	file.close();
}
}
