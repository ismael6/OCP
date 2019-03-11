package edu.ocp.jdbc.exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author IsmaSp6
 *
 *	SQLException.getMessage() -> human readable error message
 *	SQLException.getSQLState() -> sql state code of error
 *	SQLException.getErrorCode() -> database code of error
 */
public class Basics {
	public static void main(String[] args)  {
		try(Connection conn = DriverManager.getConnection("");
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("")){
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getSQLState());
			System.out.println(e.getErrorCode());
		}
	}
}
