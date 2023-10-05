package in.com.io;

import java.io.FileWriter;

public class TestFileWriter {
public static void main(String[] args)throws Exception {
	FileWriter file = new FileWriter("C:\\Users\\gagan\\Desktop\\fileread\\namdev.txt",true);
	file.write("hello\n");
	file.write("shiva");
	file.write("hello\n");
	file.write("gun ");
	file.close();
}
}
