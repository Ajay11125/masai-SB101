package day_1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class Jdbc_01_class {
	static void add_data() {
		Scanner input=new Scanner(System.in);
		System.out.print("How Many Records u want to order");
		int t=input.nextInt();
		String url = "jdbc:mysql://localhost:3306/firt";
		try(Connection conn=  DriverManager.getConnection(url,"root","458441")){
		PreparedStatement ps= conn.prepareStatement("insert into product values(?,?,?,?)");
		for(int i=0;i<t;i++) {
			System.out.println("Enter product ID:");
			int id=input.nextInt();
			System.out.println("Enter product Name:");
			String pname=input.next();
			System.out.println("Enter product Quantity:");
			int qty=input.nextInt();
			System.out.println("Enter product price:");
			int price=input.nextInt();
			ps.setInt(1, id);
			ps.setString(2, pname);
			ps.setInt(3, qty);
			ps.setInt(4, price);
			int x= ps.executeUpdate();
			if(x > 0)
				System.out.println((i+1)+" recored inserted successfully..!");
			else
				System.out.println((i+1)+" fails...");
		}
		
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	static void add_except_data() {
		Scanner input=new Scanner(System.in);
		System.out.print("How Many Records u want to insert"+"\u001B[31m"+"[Note:Price and Quantity will not be added]"+"\u001B[0m\"");
		int t=input.nextInt();
		String url = "jdbc:mysql://localhost:3306/firt";
		try(Connection conn=  DriverManager.getConnection(url,"root","458441")){
		PreparedStatement ps= conn.prepareStatement("insert into product (pid,pname) values(?,?)");
		for(int i=0;i<t;i++) {
			System.out.println("Enter product ID:");
			int id=input.nextInt();
			System.out.println("Enter product Name:");
			String pname=input.next();
			ps.setInt(1, id);
			ps.setString(2, pname);
			int x= ps.executeUpdate();
			if(x > 0)
				System.out.println((i+1)+" recored inserted successfully..!");
			else
				System.out.println((i+1)+" fails...");
		}
		
		}
		catch(SQLException e) {
			e.printStackTrace();
			
		}
	}
	//-------------------------------------------***********************------------------------
	static void update_qp() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter product ID whose qty want to update:");
		int t=input.nextInt();
		String url = "jdbc:mysql://localhost:3306/firt";
		try(Connection conn=  DriverManager.getConnection(url,"root","458441")){
			PreparedStatement ps= conn.prepareStatement("update product set price=? and quantity=? where pid=?;");
			System.out.println("Enter product Quantity:");
			int qty=input.nextInt();
			System.out.println("Enter product price:");
			int price=input.nextInt();
			ps.setInt(1, price);
			ps.setInt(2, qty);
			ps.setInt(3, t);
			int x= ps.executeUpdate();
			if(x > 0)
				System.out.println("recored updated successfully..!");
			else
				System.out.println("fails...");
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		
		}
	}
	//**********************************************----------------*******************************
	static void deleteprod() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter product qty from below u want to delete:");
		int t=input.nextInt();
		String url = "jdbc:mysql://localhost:3306/firt";
		try(Connection conn=  DriverManager.getConnection(url,"root","458441")){
			PreparedStatement ps= conn.prepareStatement("DELETE FROM product WHERE quantity<?");
			ps.setInt(1, t);
			int x= ps.executeUpdate();
			if(x > 0)
				System.out.println("recored deleted successfully..!");
			else
				System.out.println("fails...");
		}
		catch(SQLException e) {
			e.printStackTrace();
		
		}
		
	}
	//***********************************************//////////////*********************************
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Could not load the Driver main class");
		}
		Scanner input=new Scanner(System.in);
		while(true) {
			System.out.println("------------------------------------");
			System.out.println("1.Add Record");
			System.out.println("2.add Record without quanity and price");
			System.out.println("3.update price and Quantity");
			System.out.println("4.Delete records");
			System.out.println("5.Quit");
			System.out.println("------------------------------------");
			System.out.println("Select from above (1,2,3,4,5):");
			int task=input.nextInt();
			System.out.println("------------------------------------");
			if(task==5) {
				System.out.println("U exited the program");
				break;
			}
			else if(task==1) {
				add_data();
			}
			else if(task==2) {
				add_except_data();
			}
			else if(task==3) {
				update_qp();
			}
			else if(task==4){
				deleteprod();
			}
			else {
				System.out.println("Wrong choice pls choose again");
			}
		}
		
		
		
		
		
	}
}
