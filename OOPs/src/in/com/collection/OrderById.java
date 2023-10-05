package in.com.collection;

import java.util.Comparator;

public class OrderById implements Comparator<Employe> {

	@Override
	public int compare(Employe o1, Employe o2) {
		return o1.getId() - o2.getId();
	}
}

class OrderByNameAsc implements Comparator<Employe> {

	@Override
	public int compare(Employe o1, Employe o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
