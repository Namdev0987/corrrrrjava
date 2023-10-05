package in.com.practicecollectionforbatch;

public class Employee {
	private int id = 0;
	private String name = null;
	private String adress = null;
	
	public Employee(int id,String name,String adress) {
		this.id = id;
		this.name = name;
		this.adress = adress;
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
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getAdress() {
		return adress;
	}
	@Override
	public String toString() {
		
		return id + " " + name + " " + adress;
	}
}
