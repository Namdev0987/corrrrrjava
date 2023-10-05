package in.com.practicecollectionforbatch;

public class Employee1 {

	private int id = 0;
	private String name = null;
	private String address = null;

	public Employee1(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + address;
	}

	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Employee)) {

			return false;
		}

		Employee e = (Employee) obj;
 
		boolean b = this.id == e.id && this.name == e.name && this.address == e.address;

		return b;
	}

	@Override
	public int hashCode() {

		String str = id + name + address;
		
		return str.hashCode();
}
}
