package edu.ocp.functionalProgramming.primitiveStreams.functionalInterfaces;

import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;

/**
 * @author IsmaSp6
 *
 * 
 */
public class PrimitiveSpecificFunctionalInterfaces {
	public static void main(String[] args) {
		
//		Functions (abstract method: applyAs't')
		ToDoubleFunction<Object> tdf = o -> 4.2D; tdf.applyAsDouble(null);
		ToIntFunction<Object> tif = o -> 4; tif.applyAsInt(null);
		ToLongFunction<Object> tlf = o -> 4L; tlf.applyAsLong(null);
		
		
//		BiFunctions (abstract method: applyAs't')
		ToDoubleBiFunction<Object, Object> tdbf = (a,b) -> 4.2D; tdbf.applyAsDouble(null, null);
		ToIntBiFunction<Object, Object> tibf = (a,b) -> 4; tibf.applyAsInt(null, null);
		ToLongBiFunction<Object, Object> tlbf = (a,b) -> 4L; tlbf.applyAsLong(null, null);
		
		
//		t to v functions (abstract method: applyAs't')
		DoubleToIntFunction dtif = d -> (int)d; dtif.applyAsInt(4.2D);
		DoubleToLongFunction dtlf = d -> (long)d; dtlf.applyAsLong(4.2D);
		
		IntToDoubleFunction itdf = i -> (double)i; itdf.applyAsDouble(4);
		IntToLongFunction itlf = i -> (long)i; itlf.applyAsLong(4);
		
		LongToIntFunction ltif = l -> (int)l; ltif.applyAsInt(4L);
		LongToDoubleFunction ltdf = l -> (double)l; ltdf.applyAsDouble(4L);
		
		
//		Consumers (abstract method: accept)
		ObjDoubleConsumer<Object> odc = (t,d) -> {}; odc.accept(null, 4.2D);
		ObjLongConsumer<Object> olc = (t,l) -> {}; olc.accept(null, 4L);
		ObjIntConsumer<Object> oic = (t,i) -> {}; oic.accept(null, 4);
	}
}
