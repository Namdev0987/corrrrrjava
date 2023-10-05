package in.com.workout;

import java.io.FileInputStream;

import java.io.FileOutputStream;

public class Practice10 {
public static void main(String[] args) throws Exception  {
	FileInputStream in = new FileInputStream("C:\\Users\\gagan\\Desktop\\javashree\\bmw1.jpg");
	FileOutputStream out = new FileOutputStream("C:\\Users\\gagan\\Desktop\\javashree\\harddy.txt");
	int ch = in.read();
	while(ch !=-1) {
		out.write(ch);
		ch = in.read();
	}
	in.close();
	out.close();
	System.out.println("data coopy");
}
}
