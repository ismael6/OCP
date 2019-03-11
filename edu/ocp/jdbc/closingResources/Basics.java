package edu.ocp.jdbc.closingResources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author IsmaSp6
 * 
 * 	Resources inside try with resources are closed in reverse order they were opened
 * 	
 * 	closing a JDBC resource closes automatically any resources it created
 * 		closing Connection closes its Statements and ResultSets
 * 		closing Statements closes its ResultSets
 * 
 * 	A resultSet is closed automatically when there is another sql statement 
 * 		running with the same Statement object (overrides and closes the previous ResultSet)
 *
 */
public class Basics {
	public static void main(String[] args) throws SQLException {
//		closes rs, stmt and conn in this order
		try(Connection conn = DriverManager.getConnection("");
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("")){}
		
//		closes conn, and because of that, stmt and rs are closed
		try(Connection conn = DriverManager.getConnection("")){
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("");
		}
		
		try(Connection conn = DriverManager.getConnection("");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("")){
			
			ResultSet rs2 = stmt.executeQuery(""); // closes automarically rs
			int rows = stmt.executeUpdate(""); // closes automarically rs2
		} // end of try with resources block, closes rs, stmt and conn in this order with its correspondent dependencies
		
	}
}
