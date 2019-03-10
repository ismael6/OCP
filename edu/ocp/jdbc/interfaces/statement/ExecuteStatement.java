package edu.ocp.jdbc.interfaces.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author IsmaSp6
 *
 *	Statement.executeUpdate(String):int -> INSERT, UPDATE, DELETE
 *	
 *	Statement.executeQuery(String):ResultSet -> SELECT
 *	
 *	Statement.execute(String):boolean -> SELECT, INSERT, UPDATE, DELETE
 *										true if returned value is a ResultSet
 *
 *	
 *	If executeUpdate with a SELECT statement, SQLException on runtime thrown
 *	If executeQuery with not a SELECT, SQLException on runtime thrown
 *	
 */
public class ExecuteStatement {
	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:vendor:192.168.1.250:8089");
		Statement stmt = conn.createStatement();
		
		int rowsAffected1 = stmt.executeUpdate("INSERT ....");
		int rowsAffected2 = stmt.executeUpdate("UPDATE ....");
		int rowsAffected3 = stmt.executeUpdate("DELETE ....");
		
		ResultSet rs = stmt.executeQuery("SELECT");
		
		System.out.println(
				stmt.execute("sql")? 
						"ResultSet" : "int");
	}
}
