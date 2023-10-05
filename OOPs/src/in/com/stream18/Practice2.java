package in.com.stream18;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice2 {
public static void main(String[] args) throws ParseException {
	String str = "18/09/2023";
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	Date date = sdf.parse(str);
	System.out.println(date);
}
}
