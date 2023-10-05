package in.com.io1;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Emp1 implements Externalizable{
	public transient int empId = 0;
	public String name = null;
	public int salary =0;
	public int bonus = 0;
	public String adress = null;
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.write(empId);
		out.writeObject(name);
		out.write(salary);
		out.write(bonus);
		out.writeObject(adress);
		
	
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		empId = in.readInt();
		name = (String) in.readObject();
		salary = in.readInt();
		bonus = in.readInt();
		adress = (String) in.readObject();
		
	}
	
	
}
