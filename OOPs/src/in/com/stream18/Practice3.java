package in.com.stream18;

import java.util.Calendar;
import java.util.Date;

public class Practice3 {
public static void main(String[] args) {
	Calendar cal = Calendar.getInstance();
	cal.add(Calendar.DATE, 5);
	Date date = cal.getTime();
	System.out.println(date);
}
}
