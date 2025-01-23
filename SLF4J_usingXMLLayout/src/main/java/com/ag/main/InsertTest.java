package com.ag.main;

import java.sql.*;
import java.sql.DriverManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InsertTest {

	   private static final Logger logger = LoggerFactory.getLogger(InsertTest.class);
	
	public static void main(String[] args) 
	{
		logger.debug("main() method started...");
		
		try
		{
			// loading the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			logger.info("Oracle driver is loaded successful...");
			
			// creating the database connection 
			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","aniket","fullstackdeveloper");
			logger.info("Oracle database is successfully connected...");
			
			// preparing the statement
			PreparedStatement ps = con.prepareStatement("insert into emp values('E021','Aniket Gawande','ani99@gmail.com',9579547546,'developer',40000.0)");
			logger.info("prepared statement execute successfully...");
			
			int k = ps.executeUpdate();
			
			if(k>0)
			{
				System.out.println("Data inserted successfully...");
				logger.debug("Employee date inserted successfully...");
			}
		
			
		}
		catch(SQLException se)
		{
			se.printStackTrace();
			logger.error("Getting Known Exception..."+ se.getMessage()+"  "+se.getErrorCode());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			logger.error("Getting UnKnown Exception..."+ e.getMessage());
		}
		

	}

}
