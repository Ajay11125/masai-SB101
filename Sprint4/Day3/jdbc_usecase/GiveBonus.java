package jdbc_usecase;

import java.util.Scanner;

import JDBC_DAO.EmployeeDAO;
import JDBC_DAO.EmployeeDAOImpl;

public class GiveBonus {
	public static void main(String[] args) {
		EmployeeDAO dao=new EmployeeDAOImpl();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Bonus Amount");
		int bon=input.nextInt();
		
		if(dao.giveBonus(bon)) {
			System.out.println("Bonus is Updated X0X0");
		}
		else {
			System.out.println("System failure...");
		}
		
	}
}
