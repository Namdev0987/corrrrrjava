package in.com.practicebymecollection;

import java.util.Comparator;

public class ComparatorbyPhone implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getPhone().compareTo(o2.getPhone());
	}

}
