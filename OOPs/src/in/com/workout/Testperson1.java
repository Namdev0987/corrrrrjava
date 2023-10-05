package in.com.workout;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Testperson1 {
public static void main(String[] args) throws Exception {
	String str = "06/07/2002";
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	Person1 p = new Person1();
	p.setId(10);
	p.setName("deepak");
	p.setDob(sdf.parse(str));
	
	System.out.println(p.getId());
	System.out.println(p.getName());
	System.out.println(p.getDob());
}
}
