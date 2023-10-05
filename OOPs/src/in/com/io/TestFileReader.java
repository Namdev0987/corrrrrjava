package in.com.io;

import java.io.FileReader;

public class TestFileReader {
public static void main(String[] args) throws Exception {
	FileReader file = new FileReader("C:\\Users\\gagan\\Desktop\\fileread\\shiva.txt");
	int ch = file.read();
	
	while(ch != -1) {
		System.out.print((char)ch);
		ch = file.read();
		
	}
	file.close();
}
}
