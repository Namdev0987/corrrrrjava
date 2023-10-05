package in.com.collectionprape;

public class Testtommorrow {
	private int id ;
	private String name ;
	private String address;
	
	public Testtommorrow(int id ,String name,String address) {
		this.id = id;
		this.name = name;
		this.address = address;
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
	@Override
	public String toString() {
		
		return id + " " + name + " " + address;
	}
}
