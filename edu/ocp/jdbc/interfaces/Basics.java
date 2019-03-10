package edu.ocp.jdbc.interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author IsmaSp6
 *
 *	JDBC interfaces are declared in the JDK
 *	Implementations of the JDBC interfaces are on each JDBC driver (jar file)
 *
 *	Driver.- Knows how to get a connection to the database
 *	Connection.- Knows how to communicate with the database
 *	Statement.- Knows how to run the SQL
 *	ResultSet.- Knows what was returned by SELECT query
 *
 */
public class Basics {
	public static void main(String[] args) throws SQLException {
		try(Connection conn = DriverManager.getConnection("jdbc:provider:localhost/db")){ //the driver returns a Connection to database
			Statement stm = conn.createStatement(); // the connection get a statement Object
			ResultSet rs = stm.executeQuery("select 1 from dual"); // a resultSet is returned when the statement is executed 
			while(rs.next()) { // iterates rows
				System.out.println(rs.getObject(1)); //gets first column
			}
		}
	}
}
