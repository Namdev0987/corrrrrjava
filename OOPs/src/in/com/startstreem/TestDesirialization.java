package in.com.startstreem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class TestDesirialization {
public static void main(String[] args) throws Exception {
	FileInputStream file = new FileInputStream("C:\\Users\\gagan\\Desktop\\javashree\\obj1.txt");
	ObjectInputStream in = new ObjectInputStream(file);
	Marksheet m = (Marksheet) in.readObject();
	
	System.out.println(m.id);
	System.out.println(m.name);
	System.out.println(m.phyjics);
	System.out.println(m.chemistry);
	System.out.println(m.maths);
	System.out.println(m.total);
	in.close();
	file.close();
}
}
