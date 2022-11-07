package App.useCase;

import java.util.Scanner;

import App.model.Department;
import jdbc_DAO.Employee_Department;
import jdbc_DAO.Employee_DepartmentImp;

public class AddDepartment {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Department ID: ");
		int id=input.nextInt();
		System.out.println("Enter Department Name: ");
		String Name=input.next();
		System.out.println("Enter Department location: ");
		String location=input.next();
		Department dp = new Department(id, Name, location);
		Employee_Department dao=new Employee_DepartmentImp();
		System.out.print(dao.AddDepartment(dp));
	}
}
