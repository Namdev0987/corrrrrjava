package in.com.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadBykeyBoard {
public static void main(String[] args)throws Exception {
	System.out.println("plz enter hare.......!!");
	
	InputStreamReader isReader = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(isReader);
	FileWriter write = new FileWriter("C:\\Users\\gagan\\Desktop\\fileread\\xyz.txt",true);
	PrintWriter out = new PrintWriter(write);
	
	String line = in.readLine();
	while(!(line.equals("bye"))) {
		out.println(line);
		line = in.readLine();
	}
	System.out.println("this compiler is stoped!!!!");
	out.close();
	write.close();
	in.close();
	isReader.close();
}
}
