package in.com.workout;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Practicemakesperfect {

public static void main(String[] args) throws Exception  {
	FileWriter file = new FileWriter("C:\\Users\\gagan\\Desktop\\iohard\\more.txt");
	PrintWriter out = new PrintWriter(file);
	out.println("hello i am shivam");
	out.println("i am from bhopal");
	out.println("birthday boy");
	System.out.println("data coppy ");
	file.close();
	out.close();
}
}
