package app.useCase;

import java.util.Scanner;

import JDBC_DAO.productDAO;
import JDBC_DAO.productDAOimpl;
import app.Exceptions.ProductException;
import app.model.Product;

public class SearchByName {
	public static void main(String[] args) throws ProductException {
		productDAO dao= new productDAOimpl();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter product Name u want to delete: ");
		String name=input.next();
		Product pd=dao.getProductByProductName(name);
		System.out.print(pd.toString());
	}
}
