package App.model;

public class Employee {
	public int empId;
	public String ename;
	public String Address;
	public String email;
	public String Password;
	public int Salary;
	public int deptid;
	public Employee(int empId, String ename, String address, String email, String password, int salary, int deptid) {
		super();
		this.empId = empId;
		this.ename = ename;
		Address = address;
		email = email;
		Password = password;
		Salary = salary;
		this.deptid = deptid;
	}
	public Employee(int empId, String ename, String address, String email, String password, int salary) {
		super();
		this.empId = empId;
		this.ename = ename;
		Address = address;
		email = email;
		Password = password;
		Salary = salary;
	}
	
}
