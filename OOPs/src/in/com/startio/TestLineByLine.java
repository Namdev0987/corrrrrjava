package in.com.startio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestLineByLine {
public static void main(String[] args) throws Exception    {
	
	FileReader file = new FileReader("C:\\Users\\gagan\\Desktop\\Startio\\shiv.txt");
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
