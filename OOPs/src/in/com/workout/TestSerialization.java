package in.com.workout;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {
public static void main(String[] args) throws Exception {
	FileOutputStream file = new FileOutputStream("C:\\Users\\gagan\\Desktop\\javashree\\obj.txt");
	ObjectOutputStream out = new ObjectOutputStream(file);
	
	Marksheet m = new Marksheet();
	m.name = "shiv";
	m.phyjics = 89;
	m.chemistry = 90;
	m.maths = 98;
	m.total = m.phyjics + m.chemistry + m.maths;
	out.writeObject(m);
	
	out.close();
	file.close();
	System.out.println("object write successfully!!!!");
	System.out.println("total =" + m.total);
}
}
