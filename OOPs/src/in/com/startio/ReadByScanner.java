package in.com.startio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadByScanner {
public static void main(String[] args) throws Exception   {
	FileReader file = new FileReader("C:\\Users\\gagan\\Desktop\\Startio\\shiv.txt");
	Scanner sc = new Scanner(file);
	
	while(sc.hasNext()) {
		System.out.println(sc.nextLine());
	}
	sc.close();
	file.close();
}
}
