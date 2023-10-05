package in.com.workout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestDeSerialiZation {
public static void main(String[] args) throws Exception {
	FileInputStream file = new FileInputStream("C:\\Users\\gagan\\Desktop\\javashree\\obj.txt");
	ObjectInputStream in = new ObjectInputStream(file);
	Marksheet m = (Marksheet) in.readObject();
	
	System.out.println("id =" + m.id);
	System.out.println("name =" + m.name);
	System.out.println("phyjics =" + m.phyjics);
	System.out.println("maths =" + m.maths);
	System.out.println("chemistry =" + m.chemistry);
	System.out.println("total =" + m.total);
	in.close();
	file.close();
}
}
