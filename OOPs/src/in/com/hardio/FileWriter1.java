package in.com.hardio;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {

public static void main(String[] args) throws Exception {
	FileWriter writer = new FileWriter("C:\\Users\\gagan\\Desktop\\iohard\\hardeep.txt");
	writer.write("hello i am hardeep");
	writer.write("finally placed it 12 lac pakage by refrence of deepesh saported by shuvham");
	writer.close();
	System.out.println("data write successfully");
}
}
