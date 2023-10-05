package in.com.hardio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Scaner1 {
public static void main(String[] args) throws Exception {
	FileReader file = new FileReader("C:\\Users\\gagan\\Desktop\\iohard\\deepesh.txt");
	Scanner sc = new Scanner(file);
	while(sc.hasNext()) {
		System.out.println(sc.nextLine());
	}
	
	sc.close();
}
}
