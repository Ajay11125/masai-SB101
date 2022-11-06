package jdbc_usecase;

import java.util.Scanner;

import JDBC_DAO.EmployeeDAO;
import JDBC_DAO.EmployeeDAOImpl;
import jdbc_model.Employee;

public class SearchEmp {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the ID of Employee: ");
		int id=input.nextInt();
		EmployeeDAO dao=new EmployeeDAOImpl();
		Employee emp=dao.searchEmployee(id);
		System.out.println(emp.toString());
	}
}
