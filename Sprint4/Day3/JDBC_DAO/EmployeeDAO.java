package JDBC_DAO;

import java.sql.ResultSet;
import java.util.List;

import jdbc_model.Employee;

public interface EmployeeDAO {
	public int getSalaryOfEmployee(int id);
	public void getdata();
	public boolean giveBonus( int bonus);
	public boolean insertEmployee(Employee emp);
	public Employee searchEmployee(int id);
	public List<Employee> searchBySal(int sal);
		
}
