package jdbc_DAO;

import App.model.Department;
import App.model.Employee;

public interface Employee_Department {
	public String AddDepartment(Department dp);
	public String AddEmployee(Employee emp);
	public String AssignToEmp(int id,int dptid);
	public String loginEmp(int id,String pass);
}
