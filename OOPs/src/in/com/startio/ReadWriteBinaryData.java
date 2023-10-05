package in.com.startio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadWriteBinaryData {
public static void main(String[] args) throws Exception {
	FileInputStream in = new FileInputStream("C:\\Users\\gagan\\Desktop\\Startio\\xyz.jpg");
	FileOutputStream out = new FileOutputStream("C:\\Users\\gagan\\Desktop\\Startio\\dhoni.jpg");
	int ch = in.read();
	while(ch != -1) {
		out.write(ch);
		ch = in.read();
	}
	System.out.println("data coopy");
}
}
