package edu.ocp.functionalProgramming.primitiveStreams;

import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.Random;
import java.util.stream.LongStream;

/**
 * @author IsmaSp6
 * 
 * OptionalInt
 * OptionalLong
 * OptionalDouble
 * 
 * Optional.get() -> Optionalt.getAst()
 * Optional.orElseGet(Supplier) -> Optionalt.orElseGet(tSupplier)
 * 
 */
public class OptionalOnPrimitiveStreams {
	public static void main(String[] args) {
		OptionalDouble oD = OptionalDouble.of(3f);
		System.out.println(oD.getAsDouble()); // the get methods have the type as subfixes
//		All the other optional methods are the same
		oD.isPresent();
		oD.ifPresent((x) -> {});
		oD.orElse(6);
		oD.orElseGet(() -> new Random().nextFloat()); // receives a tsupplier
		
		LongStream lS = LongStream.of(3,4,5);
		long l = lS.sum(); // tStream.sum() returns the primitive t
		OptionalLong oL = lS.max(); // tStream.max returns Optional<t>
		OptionalDouble oL1 = lS.average(); // tStream.avg returns OptionalDouble
	}
}
