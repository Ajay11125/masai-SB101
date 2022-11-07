package app.useCase;

import java.util.Scanner;

import JDBC_DAO.productDAO;
import JDBC_DAO.productDAOimpl;
import app.Exceptions.ProductException;
import app.model.Product;

public class AddQuantity {
	public static void main(String[] args) throws ProductException {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter product ID: ");
		int id=input.nextInt();
		System.out.println("Enter product quantity: ");
		int qty=input.nextInt();
		productDAO dao=new productDAOimpl();
		System.out.print(dao.addProductQuantity(id, qty));
	}
}
