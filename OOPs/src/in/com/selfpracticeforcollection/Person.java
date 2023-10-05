package in.com.selfpracticeforcollection;

public class Person {
	private int id = 0;
	private String name = null;
	private String address = null;
	
	public Person(int id,String name,String address) {
		this.id = id;
		this.name = name;
		this.address =address;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAddress() {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + name + " " + address;
	}
}