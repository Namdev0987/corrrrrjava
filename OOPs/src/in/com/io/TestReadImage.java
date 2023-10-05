package in.com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestReadImage {
public static void main(String[] args)throws Exception {
	FileInputStream in = new FileInputStream("C:\\Users\\gagan\\Desktop\\image\\rays.jpg");
	FileOutputStream out = new FileOutputStream("C:\\\\Users\\\\gagan\\\\Desktop\\\\shivam.jpg");
	
	int ch = in.read();
	while (ch!=-1) {
		out.write(ch);
		System.out.print((char)ch);
		ch = in.read();
		
	}
	out.close();
	in.close();
	System.out.println("nice");
}
	
}

