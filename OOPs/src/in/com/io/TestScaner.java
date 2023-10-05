package in.com.io;

import java.io.FileReader;
import java.util.Scanner;

public class TestScaner {
public static void main(String[] args)throws Exception {
	FileReader file = new FileReader("C:\\Users\\gagan\\Desktop\\fileread\\shiva.txt");
	Scanner sc = new Scanner(file);
	
	while(sc.hasNext()) {
		String line = sc.nextLine();
		System.out.println(line);
	}
	sc.close();
	file.close();
}
}
