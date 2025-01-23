package com.ag.main;


import java.sql.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeleteTest {

	
	private static Logger logger = LoggerFactory.getLogger(DeleteTest.class);
	
	public static void main(String[] args) 
	{
		logger.debug("main() has been started...");
	
		try
		{
			// loading the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			logger.info("Oracle driver is loaded successfully...");
			
			// creating the connection 
			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","aniket","fullstackdeveloper");
			logger.info("Oracle database connection has been successful...");
			
			// preparing the statement
			PreparedStatement ps = con.prepareStatement("delete from emp where eid='E021'");
			logger.info("Statement is execute successful...");
			
			int k = ps.executeUpdate();
			logger.debug("Statement data updated successfully...");
			
			if(k>0)
			{
				System.out.println("Employee details is deleted...");
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
			logger.error("Getting Known Exception...  "+se.getMessage());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			logger.error("Getting Unknown Exception...  "+e.getMessage());
		}
		

	}

}
