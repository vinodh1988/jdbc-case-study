package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Date;

public class PLSQLDEmo {
  public static void main(String[] args) {
	  Connection con=ConnectionProvider.getConnection();
  	
  	try {
			CallableStatement cs=con.prepareCall("{call storeandprovide(?,?)}");
			cs.setString(1,"Funny Boy");
			cs.registerOutParameter(2, Types.NVARCHAR);
			cs.execute();
			
			System.out.println("Output value is  "+cs.getString(2));
			
			System.out.println("Procedure executed");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
}
