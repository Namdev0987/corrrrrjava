package in.com.kedarjiio;

import java.io.File;

public class Fileinfo {
public static void main(String[] args) {
	File f = new File("C:\\Users\\gagan\\Desktop\\Io\\shiva.txt");
	if(f.exists()) {
		System.out.println("Name:" + f.getName());
		System.out.println("path:" + f.getAbsolutePath());
		System.out.println("Access permission");
		System.out.println("writable:" + f.canWrite());
		System.out.println("Readable :"+f.canRead());
		System.out.println("is file:" + f.isFile());
		System.out.println("is dir:"+ f.isDirectory());
		
	}
	else {
		System.out.println("file does not exis");
	}
}
}
