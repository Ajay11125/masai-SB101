package App.useCase;

import java.util.Scanner;

import App.model.Employee;
import jdbc_DAO.Employee_Department;
import jdbc_DAO.Employee_DepartmentImp;

public class AddEmployee {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Employee ID: ");
		int id=input.nextInt();
		System.out.println("Enter Employee Name: ");
		String Name=input.next();
		System.out.println("Enter Employee Address: ");
		String address=input.next();
		System.out.println("Enter Employee Email: ");
		String email=input.next();
		System.out.println("Enter Employee Password: ");
		String password=input.next();
		System.out.println("Enter Employee Salary: ");
		int salary=input.nextInt();
		
		Employee emp=new Employee(id, Name, address, email, password, salary);
		Employee_Department dao=new Employee_DepartmentImp();
		System.out.println(dao.AddEmployee(emp));
	}
}
