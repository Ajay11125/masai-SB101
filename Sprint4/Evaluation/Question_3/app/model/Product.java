package app.model;

public class Product {
	public int productid;
	public String productName;
	public int price;
	public int quantity;
	public Product(int productid, String productName, int price, int quantity) {
		super();
		this.productid = productid;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productName=" + productName + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	
}
