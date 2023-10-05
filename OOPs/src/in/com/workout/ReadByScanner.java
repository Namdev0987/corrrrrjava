package in.com.workout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadByScanner {
public static void main(String[] args) throws Exception   {
	FileInputStream in = new FileInputStream("C:\\Users\\gagan\\Desktop\\javashree\\bmw1.jpg");
	FileOutputStream out = new FileOutputStream("C:\\Users\\gagan\\Desktop\\javashree\\shiva.jpg");
	int ch = in.read();
	while(ch != -1) {
		out.write(ch);
		ch = in.read();
		System.out.println("data coppy");
	}
	in.close();
	out.close();
	
	
	
	
}
}
