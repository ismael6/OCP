package edu.ocp.jdbc.interfaces.resultSet.forward.dataFromColumns;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author IsmaSp6
 * 
 * 	ResultSet.getDate(): java.sql.Date 	-> toLocalDate(): java.time.LocalDate
 * 	ResultSet.getTime(): java.sql.Time	-> toLocalTime(): java.time.LocalTime
 *	ResultSet.getTimestamp(): java.sql.Timestamp	-> toLocalDateTime(): java.time.LocalDateTime
 *
 */
public class Dates {
	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("");
		if(rs.next()) {
			
			java.sql.Date sqlDate = rs.getDate(1);
			LocalDate localDate = sqlDate.toLocalDate();
			
			java.sql.Time sqlTime = rs.getTime(1);
			LocalTime localTime = sqlTime.toLocalTime();
			
			java.sql.Timestamp sqlTimeStamp = rs.getTimestamp(1);
			LocalDateTime localDateTime = sqlTimeStamp.toLocalDateTime();
		}
	}
}
