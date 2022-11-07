package app.useCase;

import java.util.Scanner;

import JDBC_DAO.productDAO;
import JDBC_DAO.productDAOimpl;
import app.Exceptions.ProductException;
import app.model.Product;

public class AddProduct {
	public static void main(String[] args) throws ProductException {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter product ID: ");
		int id=input.nextInt();
		System.out.println("Enter product Name: ");
		String name=input.next();
		System.out.println("Enter product price: ");
		int price=input.nextInt();
		System.out.println("Enter product quantity: ");
		int qty=input.nextInt();
		
		Product prod=new Product(id, name, price, qty);
		productDAO dao=new productDAOimpl();
		System.out.print(dao.addProduct(prod));
	}
}
