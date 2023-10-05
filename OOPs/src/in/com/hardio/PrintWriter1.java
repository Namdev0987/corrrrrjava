package in.com.hardio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter1 {
public static void main(String[] args) throws Exception {
	FileWriter file = new FileWriter("C:\\Users\\gagan\\Desktop\\iohard\\prachi.txt");
	PrintWriter out = new PrintWriter(file);
	out.println("i am prachi!!!");
	out.println("she is placed in amazon, under the gaidence of shivam sir!!!");
	out.println("now a days she is very happy!!");
	file.close();
	out.close();
	System.out.println("data write successfully !!!!!");
}
}
