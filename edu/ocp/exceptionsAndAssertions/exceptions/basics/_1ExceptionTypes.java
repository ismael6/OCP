package edu.ocp.exceptionsAndAssertions.exceptions.basics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.NotSerializableException;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.DateTimeException;
import java.util.MissingResourceException;

/**
 * @author IsmaSp6
 *
 *	Throwable IS An Object
 *	Exception IS A Throwable
 *	Error IS A Throwable
 *	RuntimeException IS An Exception
 *
 * unchecked exception -> IS A RuntimeException  
 * checked exception -> IS An Exception and IS NOT A RuntimeException
 * 
 */
public class _1ExceptionTypes {
	public static void main(String[] args) {
		// checkedExceptions (REQUIRED TO CATCH OR DECLARE ON METHOD SIGNATURE)
		Exception parse = new ParseException("", 0); // convert from String to number
		Exception io = new IOException(); // input-output 
		IOException fileNotFound = new FileNotFoundException(); // input-output 
		IOException notSerializable = new NotSerializableException(); // input-output 
		SQLException sql = new SQLException(); // database
		
//		unchecked exceptions (OPTIONAL TO CATCH OR DECLARE ON METHOD SIGNATURE)
		RuntimeException arithmetic = new ArithmeticException(); // division by zero
		RuntimeException outOdBounds = new ArrayIndexOutOfBoundsException(); 
		RuntimeException clssCast = new ClassCastException();
		RuntimeException illegalArgument = new IllegalArgumentException();
		RuntimeException nullPointer = new NullPointerException();
		RuntimeException numberFormat = new NumberFormatException();
		RuntimeException arrayStore = new ArrayStoreException(); // wrong data in data structure
		RuntimeException dateTime = new DateTimeException(""); // invalid string date format
		RuntimeException missingResource = new MissingResourceException("", "", ""); //key of resource bundle or resource bundle not exist
		RuntimeException illegalState = new IllegalStateException(); // concurrency or collections
		RuntimeException unsupportedOperation = new UnsupportedOperationException(); // concurrency or collections
	}
}
