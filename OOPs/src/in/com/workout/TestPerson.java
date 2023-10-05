package in.com.workout;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
public static void main(String[] args) throws Exception   {
	
	String str = "06/08/1999";
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	Person p = new Person();
	p.SetName("shivam");
	p.setId(10);
	p.setDob(sdf.parse(str));
	
	System.out.println(p.getName());
	System.out.println(p.getId());
	System.out.println(p.getDob());
	
	
}
	
}
