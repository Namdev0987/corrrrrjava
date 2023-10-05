package in.com.todaysclass;



public class Pratcie implements Comparable<Pratcie>{
	private int empId = 0;
	private String name = null;
	
	public Pratcie(int empId,String name) {
		this.empId = empId;
		this.name = name;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		
		return empId + " " + name;
	}

	@Override
	public int compareTo(Pratcie o) {
		
		return this.empId - o.empId;
	}
}
