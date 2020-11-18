package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	
	private static Connection connection=null;
	
    static {
    	
    	try {
    		Class.forName("oracle.jdbc.OracleDriver");
    		
    		
    	connection=	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
    	}
    	catch(ClassNotFoundException e) {
    		e.printStackTrace();
    	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    public static Connection getConnection() {
    	return connection;
    }

}
