package in.com.fridaybatch15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pratice {
public static void main(String[] args) throws ParseException {
	String str = "15/09/2023";
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date d = sdf.parse(str);
	System.out.println(d);
}
}
