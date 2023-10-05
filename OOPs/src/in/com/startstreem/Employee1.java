package in.com.startstreem;

import java.io.Serializable;

public class Employee1 implements Serializable{
	public int empId = 0;
	public String name = null;
	public int Salary = 0;
	public int bonus = 0;
	public transient int total = 0;
	
}
