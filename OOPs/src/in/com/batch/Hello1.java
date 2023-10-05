package in.com.batch;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hello1 {
public static void main(String[] args) throws ParseException {
	Date d = new Date();
	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	String s = format.format(d);
	System.out.println("Date "+ s);
	
	String s2 ="08/08/2023";
	Date d1 = format.parse(s);
	System.out.println(d1);
}
}
