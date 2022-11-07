package app.useCase;

import java.util.Scanner;

import JDBC_DAO.productDAO;
import JDBC_DAO.productDAOimpl;
import app.Exceptions.ProductException;

public class deleteByName {
	public static void main(String[] args) throws ProductException {
		productDAO dao= new productDAOimpl();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter product Name u want to delete: ");
		String name=input.next();
		System.out.println(dao.deleteProductByProductName(name));
	}
}
