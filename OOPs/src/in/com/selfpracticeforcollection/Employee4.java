package in.com.selfpracticeforcollection;

public class Employee4 implements Comparable<Employee4> {
	private int id = 0;
	private String name = null;
	private int salary = 0;

	public Employee4(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + salary;
	}

	@Override
	public int compareTo(Employee4 o) {
		return this.name.compareTo(o.name);
	}

}
