package in.com.startio;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;



public class practice {
public static void main(String[] args) throws Exception   {
	BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\gagan\\Desktop\\Startio\\email.txt"));
	PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\gagan\\Desktop\\Startio\\correct.txt"));
	PrintWriter out2 = new PrintWriter(new FileWriter("C:\\Users\\gagan\\Desktop\\Startio\\incorrect.txt"));
	String line = in.readLine();
	while(line != null) {
		if(line.endsWith("gmail.com")) {
			out2.println(line);
		}
		else {
			out2.println(line);
		}
		line=in.readLine();
	}
	out2.close();
	out.close();
	in.close();
	System.out.println("data entered");
}
	
}


