package jdbc_model;

import java.util.List;

public class Employee {
	public int eid;
	public String name;
	public String Address;
	public int Salary;
	public Employee(int eid, String name, int salary) {
		super();
		this.eid = eid;
		this.name = name;
		Salary = salary;
	}
	public Employee(int eid, String name, int salary, String address) {
		super();
		this.eid = eid;
		this.name = name;
		Salary = salary;
		Address = address;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", Address=" + Address + ", Salary=" + Salary + "]";
	}
	
	
}
