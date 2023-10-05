package in.com.collectionprape;

import java.util.Comparator;

public class SortbyidComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEmpID() - o2.getEmpID();
	}

}
