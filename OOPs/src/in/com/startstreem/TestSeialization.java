package in.com.startstreem;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSeialization {
public static void main(String[] args) throws Exception {
	FileOutputStream file = new FileOutputStream("C:\\Users\\gagan\\Desktop\\javashree\\obj1.txt");
	ObjectOutputStream out = new ObjectOutputStream(file);
	Marksheet m = new Marksheet();
	m.id = 10;
	m.name = null;
	m.phyjics = 90;
	m.chemistry = 89;
	m.maths = 90;
	m.total = m.chemistry + m.phyjics + m.maths;
	
	out.writeObject(m);
	out.close();
	file.close();
	System.out.println("object write successfully!!!!");
	System.out.println(m.chemistry);
}
}
