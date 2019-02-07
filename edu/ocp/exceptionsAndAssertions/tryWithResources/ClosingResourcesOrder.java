package edu.ocp.exceptionsAndAssertions.tryWithResources;

/**
 * @author IsmaSp6
 *
 * Resources closes in order from last open to first open
 */
public class ClosingResourcesOrder {
	public static void main(String[] args) {
		try(AAA a1 = new AAA(1);
				AAA a2 = new AAA(2);
				AAA a3 = new AAA(3)){
			throw new ArithmeticException("on try");
		}
		catch(ArithmeticException e) {
			System.out.println("on catch");
		}
		finally {
			System.out.println("on finally");
		}
	}
}

class AAA implements AutoCloseable{
	
	int code;

	AAA(int code){
		this.code = code;
	}
	
	@Override
	public void close() {
		System.out.println(code);
	}
}
