package in.com.hardio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Fileinput1 {
public static void main(String[] args) throws Exception {
	FileInputStream in = new FileInputStream("C:\\Users\\gagan\\Desktop\\iohard\\thar.jpg");
	FileOutputStream out = new FileOutputStream("C:\\Users\\gagan\\Desktop\\iohard\\car.jpg");
	int ch = in.read();
	while(ch != -1) {
		out.write(ch);
		ch = in.read();
	}
	in.close();
	out.close();
	System.out.println("data copy successfully!!!!!");
}
}
