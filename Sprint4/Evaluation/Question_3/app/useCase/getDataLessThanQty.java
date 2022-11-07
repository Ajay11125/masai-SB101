package app.useCase;

import java.util.List;
import java.util.Scanner;

import JDBC_DAO.productDAO;
import JDBC_DAO.productDAOimpl;
import app.Exceptions.ProductException;
import app.model.Product;

public class getDataLessThanQty {
	public static void main(String[] args) throws ProductException {
		productDAO dao= new productDAOimpl();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Quantity from which less product u want: ");
		int qty=input.nextInt();
		List<Product> ls=dao.getAllProductQuantityLessThan(qty);
		if(ls.size()==0) {
			System.out.println("No product is less than "+qty+" quantity");
		}
		for (Product product : ls) {
			System.out.print(product.toString());
		}
	}
}
