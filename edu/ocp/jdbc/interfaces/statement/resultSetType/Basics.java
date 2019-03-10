package edu.ocp.jdbc.interfaces.statement.resultSetType;

/**
 * @author IsmaSp6
 *
 *	ResultSet.TYPE_FORWARD_ONLY -> visit the data on the order retrieved (DEFAULT)
 *	ResultSet.TYPE_SCROLL_INSENSITIVE -> visit the data in any order, resultSet do not refresh
 *	ResultSet.TYPE_SCROLL_SENSITIVE (NOT IN THE EXAM) -> visit the data in any order, resultSet refresh with the more recent database state 
 *														(not supported by a lot of databases-drivers)
 *
 * 	If resultSetType requested is not available, the next LOWER resultSetType is applied
 * 	
 */
public class Basics {
}
