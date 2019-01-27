package edu.ocp.functionalProgramming.primitiveStreams.functionalInterfaces;

import java.util.function.BooleanSupplier;

/**
 * @author IsmaSp6
 *
 * boolean getAsBoolean()
 */
public class BooleanSupplierImpl {
	public static void main(String[] args) {
		BooleanSupplier bs = () -> true;
		System.out.println(bs.getAsBoolean());
	}
}
