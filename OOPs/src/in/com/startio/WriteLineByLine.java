package in.com.startio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteLineByLine {
public static void main(String[] args) throws Exception {
	FileWriter file = new FileWriter("C:\\Users\\gagan\\Desktop\\Startio\\shiva.txt");
	PrintWriter out = new PrintWriter(file);
	
	out.println("hi shivam");
	out.println("how are u");
	out.println("i am genious");
	out.close();
	
	System.out.println("data write successfully");
}
}
