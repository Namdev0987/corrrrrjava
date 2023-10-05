package in.com.hardio;

import java.io.BufferedReader;

import java.io.FileReader;

public class BufferReader1 {
public static void main(String[] args) throws Exception {
	FileReader file = new FileReader("C:\\Users\\gagan\\Desktop\\iohard\\deepesh.txt");
	BufferedReader reader = new BufferedReader(file);
	String line = reader.readLine();
	while(line != null) {
		System.out.println(line);
		line = reader.readLine();
	}
	reader.close();
	file.close();
}
}
