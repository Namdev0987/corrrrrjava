package in.com.kedarjiio;

import java.io.FileInputStream;

import java.io.ObjectInputStream;

public class TestExterDesirialization {
	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("C:\\Users\\gagan\\Desktop\\Io\\Extobj.txt");
		ObjectInputStream in = new ObjectInputStream(file);
		Employee e = (Employee) in.readObject();

		System.out.println("id =" + e.id);
		System.out.println("name =" + e.name);
		System.out.println("adress =" + e.adress);
		System.out.println("salary =" + e.salary);

		in.close();
		file.close();
	}

}
