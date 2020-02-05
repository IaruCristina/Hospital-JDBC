package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

//		public DatabaseConnection() throws SQLException{}
//		
	
	public Statement createConn() throws SQLException {
		String url ="jdbc:mysql://localhost:3306/spital?useSSL=false"; //?useSSL=false - security - optional
		String user="root";
		String password="5RrLlQ";
	
		Connection con= DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		
		return st;
 
	}
	
}
