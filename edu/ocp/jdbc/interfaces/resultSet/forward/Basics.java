package edu.ocp.jdbc.interfaces.resultSet.forward;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

/**
 * @author IsmaSp6
 * 
 * 	A ResultSet has a cursor, which points to the current location in the data
 * 
 * 		ResultSet.next() -> moves cursor to next row and indicates if there is available data
 * 			if there is no available data, return false
 * 
 *  	Always use an IF or WHILE statement when CALLING rs.next (this avoids calling data on not available data scopes)
 *  	column indexes BEGINS on 1
 *
 */
public class Basics {
	public static void main(String[] args) throws SQLException {
		Map<Integer, String> values = new HashMap<>();
		Connection conn = DriverManager.getConnection("");
		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery("SELECT");
		
		rs.getLong(1); // RUNTIME EXCEPTION, cursor is before of rows (did not call rs.next())
		
		while(rs.next()) { // gets all rows safe because if next return false, do not get values
			int id = rs.getInt("id"); // get element by column name
			String name = rs.getString(1); // get element by column number
			values.put(id, name);
		}
		
		if(rs.next()) { // gets 1 element safe because if next return false, do not get values
			String name = rs.getString(0); // RUNTIME EXCEPTION, column 0 do not exists (column numbers begin on 1)	
		}
		
		rs.next(); // ok, next() returns true or false but next line may have a problem
		String name = rs.getString(1); // may throw exception because can be out of rows bounds
	}
}
