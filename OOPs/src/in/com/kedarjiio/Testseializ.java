package in.com.kedarjiio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Testseializ {
	public static void main(String[] args) throws Exception {
		FileOutputStream file = new FileOutputStream("C:\\Users\\gagan\\Desktop\\Io\\obj.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Marksheet m = new Marksheet();
		m.id = 10;
		m.name = "deepak";
		m.physics = 90;
		m.chemistry = 90;
		m.maths = 90;
		m.total = m.physics + m.chemistry + m.maths;
		
		out.writeObject(m);
		out.close();
		file.close();
		
		System.out.println("object write suceesfully");
		//System.out.println("total =" +m.total);
	}

}
