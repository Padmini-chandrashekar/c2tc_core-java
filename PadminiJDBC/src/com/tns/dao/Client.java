package com.tns.dao;

import java.sql.Connection;
import java.sql.SQLException;
public class Client {

	public static void main(String[] args) throws SQLException{
		
		//checking the connection establishment
		//Connection connection = DBUtil.getconnection();
		
		CrudOperation.addEmployee();  
	}
	
	
}
