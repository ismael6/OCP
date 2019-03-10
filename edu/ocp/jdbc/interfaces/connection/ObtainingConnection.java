package edu.ocp.jdbc.interfaces.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author IsmaSp6
 *
 *	DriverManager.- Basic service for managing a set of JDBC drivers
 *	(JDBC driver is in the jar and the jar should be in the classpath) 
 *		DriverManager.getConnection("url")
 *		DriverManager.getConnection("url", "user", "pass");
 *	
 *	DataSource (NOT IN THE EXAM).- Same as driver manager but with more features
 */
public class ObtainingConnection {
	public static void main(String[] args) throws SQLException {
		Connection simplyUrl = DriverManager.getConnection("url");
		Connection withCredentials = DriverManager.getConnection("url", "user", "pass");
		
		System.out.println(simplyUrl); // specific vendor implementation
		System.out.println(withCredentials); // specific vendor implementation
	}
}
