package in.com.kedarjiio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestExterSerialization {
	public static void main(String[] args) throws Exception {
		FileOutputStream file = new FileOutputStream("C:\\Users\\gagan\\Desktop\\Io\\Extobj.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);
		Employee e = new Employee();
		e.id = 1;
		e.name = "mukesh";
		e.adress = "indore";
		e.salary = 500000;

		out.writeObject(e);

		out.close();
		file.close();
		System.out.println("object write sucessfully !!!1");

	}

}
