package in.com.kedarjiio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class TestDesirialiiz {
public static void main(String[] args) throws Exception {
	FileInputStream file = new FileInputStream("C:\\Users\\gagan\\Desktop\\Io\\obj.txt");
	ObjectInputStream in = new ObjectInputStream(file);
	Marksheet m = (Marksheet) in.readObject();
	System.out.println("id =" + m.id);
	System.out.println("name =" + m.name);
	System.out.println("physics ="+ m.physics);
	System.out.println("Chemistry =" + m.chemistry);
	System.out.println("maths="+ m.maths);
	System.out.println("total ="+ m.total);
	
	in.close();
	file.close();
}
}
