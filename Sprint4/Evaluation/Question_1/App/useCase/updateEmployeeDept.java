package App.useCase;

import java.util.Scanner;

import jdbc_DAO.Employee_Department;
import jdbc_DAO.Employee_DepartmentImp;

public class updateEmployeeDept {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Department ID: ");
		int dptid=input.nextInt();
		System.out.println("Enter Employee ID: ");
		int id=input.nextInt();
		Employee_Department dao=new Employee_DepartmentImp();
		System.out.print(dao.AssignToEmp(id, dptid));
	}

}
