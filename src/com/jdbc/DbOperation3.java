package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DbOperation3 {
    public static void main(String an[]) {
Connection con=ConnectionProvider.getConnection();
    	
    	try {
			Statement s= con.createStatement();
			ResultSet rs=s.executeQuery("select * from person");
			ResultSetMetaData rmd=rs.getMetaData();
			int n=rmd.getColumnCount();
			for(int i=1;i<=n;i++)
				System.out.printf("%30s", rmd.getColumnName(i));
			
			System.out.printf("\n--------------------------------------------------------------------------------------------------------");
			while(rs.next()) {
				System.out.printf("\n%30s %30s %30s",rs.getInt(1),rs.getString(2),rs.getString(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
