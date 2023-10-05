package in.com.io;

import java.io.FileWriter;
import java.io.PrintWriter;



public class TestPrintWriter {
public static void main(String[] args)throws Exception {
	
	FileWriter file = new FileWriter("C:\\Users\\gagan\\Desktop\\fileread//namdev.txt",true);
	PrintWriter out = new PrintWriter(file);
	
	out.println("hello shivam how are u!!!!");
	out.close();
	file.close();
}
}
