package jdbc_usecase;

import java.sql.ResultSet;
import java.sql.SQLException;

import JDBC_DAO.EmployeeDAOImpl;

public class GetAllData {
	public static void main(String[] args) {
		EmployeeDAOImpl dao=new EmployeeDAOImpl();
		dao.getdata();

	}
}
