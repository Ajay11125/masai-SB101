package jdbc_usecase;

import java.util.Scanner;
import java.util.*;
import JDBC_DAO.EmployeeDAO;
import JDBC_DAO.EmployeeDAOImpl;
import jdbc_model.Employee;

public class SearchBySal {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter salary of Employee: ");
		int sal=input.nextInt();
		EmployeeDAO dao=new EmployeeDAOImpl();
		List<Employee> emp=dao.searchBySal(sal);
		for(int i=0;i<emp.size();i++) {
			System.out.println(emp.get(i).toString()); 
		}
		
	}
}
