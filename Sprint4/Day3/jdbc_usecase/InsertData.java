package jdbc_usecase;

import java.util.Scanner;

import JDBC_DAO.EmployeeDAO;
import JDBC_DAO.EmployeeDAOImpl;
import jdbc_model.Employee;

public class InsertData {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Employee ID: ");
		int id=input.nextInt();
		System.out.println("Enter Employee Name: ");
		String name=input.next();
		System.out.println("Enter Employee Salary: ");
		int sal=input.nextInt();
		Employee emp=new Employee(id, name, sal);
		EmployeeDAO dao=new EmployeeDAOImpl();
		if(dao.insertEmployee(emp)) {
			System.out.print("Recorde is Added");
		}
		else {
			System.out.println("fail to add...");
		}	
	}
}
