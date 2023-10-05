package in.com.fridaybatch15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice3 {
public static void main(String[] args) {
	Date d = new Date();
	System.out.println(d);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	String str = sdf.format(d);
	System.out.println(str);
	
}
}
