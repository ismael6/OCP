package edu.ocp.jdbc.interfaces.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author IsmaSp6
 *
 *	An statement is needed to run and sql sentence
 *		Connection.createStatement() by default TYPE_FORWARD_ONLY and CONCUR_READ_ONLY
 *		Connection.createStatement(resultset-type, resultset-concurrency)
 *		
 */
public class ObtainingStatement {
	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("url");
		
		Statement simplyStmt = connection.createStatement();
		Statement customStmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	}
}
