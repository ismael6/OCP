package edu.ocp.jdbc.interfaces.statement.resultSetConcurrency;

/**
 * @author IsmaSp6
 *
 *	ResultSet.CONCUR_READ_ONLY -> the database can not be updated with the ResultSet (DEFAULT)
 *	ResultSet.CONCUR_UPDATABLE -> the database can be modified using the ResultSet (not supported by a lot of databases-drivers)
 *
 *	If resultSetConcur requested is not available, the next LOWER resultSetConcur is applied
 */
public class Basics {
}
