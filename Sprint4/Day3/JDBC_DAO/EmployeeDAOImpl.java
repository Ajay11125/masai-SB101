package JDBC_DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

import app.utility.DButil;
import jdbc_model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{
	//====================================get Salary==================================
	@Override
	public int getSalaryOfEmployee(int id) {
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select salary from employee where eid=?;");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				return rs.getInt("Salary");
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	//============================================All Details===============================
	@Override
	public void getdata() {
		
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from Employee;");
			ResultSet res=ps.executeQuery();
			System.out.println("-----------------DATA--------------");
			while(res.next()) {
				int id=res.getInt("eid");
				String name=res.getString("name");
				String add=res.getString("Address");
				int sal=res.getInt("salary");
				System.out.println(id+" "+name+" "+add+" "+sal);
				System.out.println("-------------------------------");
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
	//=============================================give Bonus======================================
	@Override
	public boolean giveBonus( int bonus) {
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("update Employee set salary=salary+?;");
			ps.setInt(1, bonus);
			ps.executeUpdate();
			return true;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}
	//===============================================insert Employee================================
	@Override
	public boolean insertEmployee(Employee emp) {
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("insert into Employee (eid,name,salary) values(?,?,?)");
			ps.setInt(1, emp.eid);
			ps.setString(2,emp.name);
			ps.setInt(3, emp.Salary);
			ps.executeUpdate();
			return true;			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	//====================================================Search Employee===============================
	@Override
	public Employee searchEmployee(int id) {
		Employee emp=null;
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from Employee where eid=?;");
			ps.setInt(1, id);
			ResultSet res=ps.executeQuery();
			System.out.println("-----------------DATA--------------");
			if(res.next()) {
				int eid=res.getInt("eid");
				String name=res.getString("name");
				String add=res.getString("Address");
				int sal=res.getInt("salary");
				 emp=new Employee(eid, name, sal, add);
				return emp;
			}	
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return emp;
		
	}
	//=============================================================search by Salary============================
	@Override
	public List<Employee> searchBySal(int sal) {
		Employee emp=null;
		List<Employee> list=new ArrayList();
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from Employee where salary<?;");
			ps.setInt(1, sal);
			ResultSet res=ps.executeQuery();
			System.out.println("-----------------DATA--------------");
			while(res.next()) {
				int eid=res.getInt("eid");
				String name=res.getString("name");
				String add=res.getString("Address");
				int salary=res.getInt("salary");
				emp=new Employee(eid, name, salary, add);
				list.add(emp);
			}
			return list;
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}
	

}
