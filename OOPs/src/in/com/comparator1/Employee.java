package in.com.comparator1;

public class Employee {
	
	private String name ;
	private int phone ;
	private int empId;
	
	public Employee(String name,int phone,int empId) {
		this.name = name ;
		this.phone = phone;
		this.empId = empId;
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
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getEmpId() {
		return empId;
	}
//	@Override
//	public int compareTo(Employee o) {
//		
//		return this.getEmpId() - o.getEmpId();
//	}
	@Override
	public String toString() {
		
		return name + " " + phone + " " + empId;
	}

}
