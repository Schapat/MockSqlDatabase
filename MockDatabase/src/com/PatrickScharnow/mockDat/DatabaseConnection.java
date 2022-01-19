package com.PatrickScharnow.mockDat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
		
		private Connection dbConnection;
		
		public void getDBConnection() throws ClassNotFoundException, SQLException {		
			Class.forName("com.mysql.jdbc.Driver");
			dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:6666/ebike", "root", "password");		
		}
		
		public int executeQuery(String query) throws ClassNotFoundException, SQLException {
			return dbConnection.createStatement().executeUpdate(query);
		}

	
}
