package com.ag.main;

import java.sql.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SelectTest {

	private static Logger logger = LoggerFactory.getLogger(SelectTest.class);
	
	public static void main(String[] args) 
	{
		logger.debug("main() method has been started..." );
		
		try
		{
			// loading the driver 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			logger.info("Loading oracle driver successful...");
			
			// creating the connection
			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","aniket","fullstackdeveloper");
			logger.info("Establishing the connection successful...");
			
			// preparing the statement
			
			PreparedStatement ps1 = con.prepareStatement("select * from emp");
			logger.info("Retrieve data through statemet is done...");
			
			ResultSet rs = ps1.executeQuery();
			logger.info("Getting data in resultset object");
			
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"    "+rs.getString(2)+"    "+rs.getString(3)+"    "+
			rs.getLong(4)+"    "+rs.getString(5)+"    "+rs.getFloat(6));
			}
			logger.debug("Data display on console successfully...");
			
			con.close();
			ps1.close();
			
		}
		catch(SQLException se)
		{
			se.printStackTrace();
			logger.error("Getting Known Exception... "+ se.getMessage()+"   "+ se.getErrorCode());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			logger.error("Getting UnKnown Exception...  "+ e.getMessage());
		}
		
		
		
		

	}

}
