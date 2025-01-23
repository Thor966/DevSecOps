package com.ag.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class SelectTest {

	private static Logger logger = LoggerFactory.getLogger(SelectTest.class);
	
	public static void main(String[] args) 
	{
		logger.debug("main() method started...");
		
		try
		{
			
			// loading the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			logger.info("Oracle driver loaded successfully...");
			// Establishing the connection
			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","aniket","fullstackdeveloper");
			
			
			logger.info("Orcle database connection successful...");
			
			// prepared statement
			PreparedStatement ps1 = con.prepareStatement
					("select * from emp");
			logger.info("Data retrieve successful....");
			
			ResultSet rs = ps1.executeQuery();
			
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"     "+ rs.getString(2)+"     "+rs.getString(3)+"     "+
			rs.getLong(4)+"     "+ rs.getString(5)+"     "+ rs.getFloat(6));
			}
			logger.debug("Data display on display....");
		}
		catch(SQLException se)
		{
			se.printStackTrace();
			logger.error("Getting Known Exception...  "+ se.getMessage()+" "+se.getErrorCode());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			logger.error("Getting Unknown Error..." + e.getMessage());
		}

	}

}
