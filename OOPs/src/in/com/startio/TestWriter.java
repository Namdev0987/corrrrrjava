package in.com.startio;

import java.io.FileWriter;
import java.io.IOException;

public class TestWriter {
public static void main(String[] args) throws Exception  {
	
	FileWriter writer = new FileWriter("C:\\Users\\gagan\\Desktop\\Startio\\gun.txt");
	writer.write("heloo i am java developer");
	writer.close();
	System.out.println("data write successfully");
	
}
}
