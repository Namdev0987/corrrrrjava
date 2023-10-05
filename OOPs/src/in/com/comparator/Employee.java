package in.com.comparator;

public class Employee {
	private String name ;
	private String phone;
	private int empId;
	
	public Employee(String name,String phone,int empId) {
		this.name = name;
		this.phone = phone;
		this.empId = empId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getEmpId() {
		return empId;
	}
	@Override
	public String toString() {
		
		return name + " " + phone + " " + empId;
	}
//	@Override
//	public int compareTo(Employee o) {
//		
//		return this.getEmpId() - o.getEmpId();
//	}
}
