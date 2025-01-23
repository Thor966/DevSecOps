package com.ag.main;

import java.sql.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UpdateTest {

	private static Logger logger = LoggerFactory.getLogger(UpdateTest.class);
	
	public static void main(String[] args) {
		
		logger.debug("main() method has been started...");
		
		try
		{
			// loading the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			logger.info("Loading the driver successful...");
			
			// creating the connection
			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","aniket","fullstackdeveloper");
			logger.info("Establishing the database connection is successfully....");
			
			// preparing the statement 
			PreparedStatement ps = con.prepareStatement("update emp set esal=23000 where eid='E009'");
			logger.info("Statement created and updating the data...");
			
			int k = ps.executeUpdate();
			logger.info("executeUpdate() execute successfully...");
			
			if(k>0)
			{
				System.out.println("Employee salary updated successfully...");
				logger.debug("Employee salary updated successfully...");
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
			logger.error("Getting Known Exception  "+se.getMessage());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			logger.error("Getting UnKnown Exception  "+e.getMessage());
		}

	}

}
