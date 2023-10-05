package in.com.collectionprape;

public class Employee {
	
	private int empId;
	private String name;
	private int phone;
	
	public Employee(int empId,String name,int phone) {
		this.empId = empId;
		this.name = name;
		this.phone = phone;
	}
	
	public void setEmpId(int empId ) {
		this.empId = empId;
	}
	public int getEmpID() {
		return empId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public int getPhone() {
		return phone;
	}
	
	@Override
	public String toString() {
		
		return empId + " " + name + " " + phone;
	}

//	@Override
//	public int compareTo(Employee o) {
//		
//		return this.empId - o.empId;
//	}
}
