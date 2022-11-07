package JDBC_DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import app.Exceptions.ProductException;
import app.model.Product;
import app.utility.DButil;

public class productDAOimpl implements productDAO {
	//======================================Insert  Data================================================
	@Override
	public String addProduct(Product product) throws ProductException {
		String msg="";
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("insert into product values(?,?,?,?);");
			ps.setInt(1, product.productid);
			ps.setString(2, product.productName);
			ps.setInt(3, product.price);
			ps.setInt(4, product.quantity);
			
			int x=ps.executeUpdate();
			if(x>0) {
				msg="Record Inserted Successfully";
				return msg;
			}
			else {
				msg="Fail...";
				return msg;
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			return e.getMessage();
			// TODO: handle exception
		}
	}
	//===================================================get product details=================================

	@Override
	public List<Product> getAllProducts() throws ProductException {
		List<Product> ls=new ArrayList<>();
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from product;");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Product pd=new Product(rs.getInt("productid"), rs.getString("productName"), rs.getInt("price"),rs.getInt("quantity"));
				ls.add(pd);
			}
			return ls;
		}
		catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}
	
	
//===================================================get product less than qty===============================
	@Override
	public List<Product> getAllProductQuantityLessThan(int quantity) throws ProductException {
		List<Product> ls=new ArrayList<>();
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from product where quantity<?;");
			ps.setInt(1, quantity);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Product pd=new Product(rs.getInt("productid"), rs.getString("productName"), rs.getInt("price"),rs.getInt("quantity"));
				ls.add(pd);
			}
			return ls;
		}
		catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}
//=======================================================add Quantity=================================================
	@Override
	public String addProductQuantity(int productId, int Quantity) throws ProductException {
		String msg="";
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("update product set quantity=quantity+? where productid=?;");
			ps.setInt(1, Quantity);
			ps.setInt(2, productId);
			int x=ps.executeUpdate();
			if(x>0) {
				msg="Record updated Successfully";
				return msg;
			}
			else {
				msg="Fail...";
				return msg;
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			return e.getMessage();
			// TODO: handle exception
		}
	}
//==========================================================delete product by name==================================================
	@Override
	public String deleteProductByProductName(String pname) throws ProductException {
		String msg="";
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("delete from product where productName=?;");
			ps.setString(1, pname);
			int x=ps.executeUpdate();
			if(x>0) {
				msg="Record deleted Successfully";
				return msg;
			}
			else {
				msg="Fail...";
				return msg;
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			return e.getMessage();
			// TODO: handle exception
		}
	}
//======================================================Search by Name=================================================================
	@Override
	public Product getProductByProductName(String pname) throws ProductException {
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from product where productName=?;");
			ps.setString(1, pname);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				Product pd=new Product(rs.getInt("productid"), rs.getString("productName"), rs.getInt("price"),rs.getInt("quantity"));
				return pd;
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}
	

}
//=====================================================END===================================================================
