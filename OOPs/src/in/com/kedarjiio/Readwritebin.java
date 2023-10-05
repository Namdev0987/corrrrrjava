package in.com.kedarjiio;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Readwritebin {
	public static void main(String[] args) throws Exception {
		
		FileInputStream in = new FileInputStream("C:\\Users\\gagan\\Desktop\\Io\\sshivam.jpg");
		FileOutputStream out = new FileOutputStream("C:\\\\Users\\\\gagan\\\\Desktop\\\\Io\\\\shiva.jpg");
		int ch = in.read();
		while (ch!= -1) {
			//out.write(ch);
			System.out.print((char)ch);
			ch=in.read();
			
		}
		in.close();
		System.out.println("Data copied successfully!!!!");
	}
}
