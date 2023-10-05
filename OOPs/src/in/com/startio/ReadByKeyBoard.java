package in.com.startio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadByKeyBoard {
public static void main(String[] args) throws Exception{
	InputStreamReader isReader = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(isReader);
	PrintWriter out = new PrintWriter("C:\\Users\\gagan\\Desktop\\Startio\\key.txt");
	String line = in.readLine();
	while(!(line.equals("bye"))) {
		out.println(line);
		line = in.readLine();
	}
	in.close();
	out.close();
	isReader.close();
	
}
}
