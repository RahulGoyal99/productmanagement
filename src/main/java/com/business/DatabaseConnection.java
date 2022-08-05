package com.business;

import java.sql.*;
public class DatabaseConnection {
	static Connection con=null;
	public static Connection getMyConnection() {
		try{  
			
			//step1 load the driver class in memory at run time 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step2 create  the connection object 
			 
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/productmanagement","root","Goyal@1234");  
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		return con;
		
		}
}