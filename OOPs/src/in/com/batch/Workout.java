package in.com.batch;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Workout {
public static void main(String[] args) throws ParseException   {
	String str = "12/02/2022";
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date date = sdf.parse(str);
	System.out.println(date);
	
	
	
	
	
	
	
}
}
