package jdbc_DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import App.model.Department;
import App.model.Employee;
import App.utility.DButil;


public class Employee_DepartmentImp implements Employee_Department {
//======================================================Insert Department==========================================
	@Override
	public String AddDepartment(Department dp) {
		String msg="";
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("insert into Department values(?,?,?);");
			ps.setInt(1, dp.did);
			ps.setString(2, dp.dname);
			ps.setString(3, dp.location);
			int x=ps.executeUpdate();
			if(x>0) {
				msg="Record Inserted Successfully";
				return msg;
			}
			else {
				msg="Fail...";
				return msg;
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			return e.getMessage();
			// TODO: handle exception
		}
	}
//=============================================================Add Employee without deptID======================================

	@Override
	public String AddEmployee(Employee emp) {
		String msg="";
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("insert into Employee (empid,ename,address,email,password,salary) values(?,?,?,?,?,?);");
			ps.setInt(1, emp.empId);
			ps.setString(2, emp.ename);
			ps.setString(3, emp.Address);
			ps.setString(4, emp.email);
			ps.setString(5, emp.Password);
			ps.setInt(1, emp.Salary);
			int x=ps.executeUpdate();
			if(x>0) {
				msg="Record Inserted Successfully";
				return msg;
			}
			else {
				msg="Fail...";
				return msg;
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			return e.getMessage();
			// TODO: handle exception
		}
	}
//============================================================Assign to Employee============================================

	@Override
	public String AssignToEmp(int id, int dptid) {
		String msg="";
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("update Employee set deptid=? where empid=?;");
			ps.setInt(1, dptid);
			ps.setInt(2, id);
			int x=ps.executeUpdate();
			if(x>0) {
				msg="Record updated Successfully";
				return msg;
			}
			else {
				msg="Fail...";
				return msg;
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			return e.getMessage();
			// TODO: handle exception
		}
	}
//===============================================================login Employee============================================

	@Override
	public String loginEmp(int id, String pass) {
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from Employee where empid=? and password=?;");
			ps.setInt(1, id);
			ps.setString(2, pass);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				Employee pd=new Employee(rs.getInt("empid"), rs.getString("ename"), rs.getString("Address"),rs.getString("email"),rs.getString("password"),rs.getInt("salary"),rs.getInt("deptid"));
				return "Welcome "+pd.ename;
			}
			else {
				return "No user Exist or wrong Details";
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}
	

}
//===============================================END=====================================================================
