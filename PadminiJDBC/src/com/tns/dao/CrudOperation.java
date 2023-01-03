package com.tns.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class CrudOperation {
	
	//Create using Prepared Statement
		public static void addEmployee() throws SQLException {
			Connection connection = DBUtil.getconnection();
			if(connection!=null)
				System.out.println("JDBC:Connection is established");
			PreparedStatement stmt=connection.prepareStatement("INSERT INTO employees values(?,?,?,?)");  
			stmt.setInt(1, 777); //1 specifies the first parameter in the query 
			stmt.setString(2,"padma"); 
			stmt.setDouble(3,80); 
			stmt.setDouble(4, 10);
			int i=stmt.executeUpdate();  
		     if(i==1)
			System.out.println("Data Inserted");
		     
		}
		
		/*
		 * //Update using Prepared Statement public static void updateEmployee() throws
		 * SQLException { Connection connection = DBUtil.getconnection();
		 * if(connection!=null) System.out.println("JDBC:Connection is established");
		 * PreparedStatement
		 * stmt=connection.prepareStatement("UPDATE employees SET ename=? WHERE empid=?"
		 * ); stmt.setString(1,"pavi"); stmt.setDouble(2,454); int
		 * i=stmt.executeUpdate(); if(i==1) System.out.println("Update is successful");
		 * }
		 */
		
		/*
		 * //Delete using prepared Statement public static void deleteEmployee() throws
		 * SQLException { Connection connection = DBUtil.getconnection();
		 * if(connection!=null) System.out.println("JDBC:Connection is established");
		 * PreparedStatement
		 * stmt=connection.prepareStatement("DELETE FROM employees WHERE id=?");
		 * stmt.setDouble(1,100); int i=stmt.executeUpdate(); if(i==1)
		 * System.out.println("Delete is successful"); }
		 */
		//Retrieve All using Prepared Statement
		public static void getEmployee() throws SQLException {
			Connection connection = DBUtil.getconnection();
			if(connection!=null)
				System.out.println("JDBC:Connection is established");
			PreparedStatement stmt=connection.prepareStatement("SELECT * FROM employees");  
			ResultSet rs=stmt.executeQuery();  
			while(rs.next()){  
			System.out.println(rs.getInt(1)+" "+rs.getString(2)); 
			}
		}
}