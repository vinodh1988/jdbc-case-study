package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DbOperations2 {
	
	public static void main(String n[]) {
Connection con=ConnectionProvider.getConnection();
 Scanner sc=new Scanner(System.in);
    	try {
    		
    		PreparedStatement ps=con.prepareStatement("insert into java18 values(?,?)");
    		while(true) {
    				System.out.println("Enter sno and name in each line");
    					int sno=Integer.parseInt(sc.next());
    					String name=sc.next();
    		        ps.setInt(1, sno);
    		        ps.setString(2, name);
    		        if(sno==-1)
    		        	break;
    		        ps.executeUpdate();
    		    	System.out.println("Row  created");
    		}
    		
			//Statement s= con.createStatement();
			//s.executeUpdate("insert into java18 values(1,'Ratan')");
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
