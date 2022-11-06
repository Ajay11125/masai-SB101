package jdbc_usecase;

import java.util.Scanner;

import JDBC_DAO.EmployeeDAOImpl;

public class GetSalaryById {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Employee ID: ");
		int id=input.nextInt();
		EmployeeDAOImpl dao=new EmployeeDAOImpl();
		int salary=dao.getSalaryOfEmployee(id);
		if(salary==0) {
			System.out.println("No Employee of this ID");
		}
		else {
			System.out.println("Salary of the Emplyee id "+id+" is "+salary);
		}
		
	}
}
