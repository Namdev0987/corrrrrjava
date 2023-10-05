package in.com.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class TestReadWrite {
public static void main(String[] args)throws Exception {
	FileReader read = new FileReader("C:\\Users\\gagan\\Desktop\\fileread\\shiva.txt");
	BufferedReader in = new BufferedReader(read);
	FileWriter write = new FileWriter("C:\\Users\\gagan\\Desktop\\fileread\\namdev.txt");
	PrintWriter out = new PrintWriter(write);
	String line = in.readLine();
	
	while(line!=null) {
		out.print(line);
		line = in.readLine();
	}
	out.close();
	write.close();
	in.close();
	read.close(); 
}
}
