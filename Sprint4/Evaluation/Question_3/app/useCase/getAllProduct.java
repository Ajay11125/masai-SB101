package app.useCase;

import java.util.List;

import JDBC_DAO.productDAO;
import JDBC_DAO.productDAOimpl;
import app.Exceptions.ProductException;
import app.model.Product;

public class getAllProduct {
	public static void main(String[] args) throws ProductException {
		productDAO dao= new productDAOimpl();
		List<Product> ls=dao.getAllProducts();
		for (Product product : ls) {
			System.out.print(product.toString());
		}
	}
}
