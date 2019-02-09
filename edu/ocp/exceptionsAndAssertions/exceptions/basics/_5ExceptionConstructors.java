package edu.ocp.exceptionsAndAssertions.exceptions.basics;

import java.io.IOException;

public class _5ExceptionConstructors {
	public static void main(String[] args) throws CustomException{
//		throw new CustomException();
//		throw new CustomException("message test");
//		throw new CustomException(new IOException());
	}
}


class CustomException extends Exception{
	public CustomException() { // no args constructor exception
		super();
	}
	
	public CustomException(String message){ // string message info exception
		super(message);
	}
	
	public CustomException(Exception e){ //wraps another exception
		super(e);
	}
}
