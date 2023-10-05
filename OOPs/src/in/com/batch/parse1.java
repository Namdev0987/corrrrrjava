package in.com.batch;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class parse1 {
public static void main(String[] args) throws ParseException {
	String str = "10/08/2023";
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date d = sdf.parse(str);
	System.out.println(d);
}
}
