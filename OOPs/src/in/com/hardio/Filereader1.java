package in.com.hardio;


import java.io.FileReader;
import java.io.IOException;

public class Filereader1 {
public static void main(String[] args) throws IOException {
	FileReader reader = new FileReader("C:\\Users\\gagan\\Desktop\\iohard\\deepesh.txt");
	int ch = reader.read();
	while(ch != -1) {
		System.out.print((char)ch);
		ch = reader.read();
	}
	reader.close();
	
}
}
