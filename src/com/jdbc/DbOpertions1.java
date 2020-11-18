package com.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbOpertions1 {
    public static void main(String[] args) {
		
    	Connection con=ConnectionProvider.getConnection();
    
    	try {
    		con.setAutoCommit(false);
			Statement s= con.createStatement();
			s.executeUpdate("insert into java18 values(255,'Jahan')");
			System.out.println("Row  created");
			con.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

/*
 * JPA
 * Hibernate
 * 
 *


/*

  insert/update/delete

select

*/