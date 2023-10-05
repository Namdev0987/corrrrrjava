package in.com.batch;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Hello {
public static void main(String[] args) {
	Date d = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	String str =sdf.format(d);
	System.out.println(d);
	System.out.println(str);
	
	
	
}

}