package edu.ocp.functionalProgramming.primitiveStreams.functionalInterfaces;

import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.LongUnaryOperator;

/**
 * @author IsmaSp6
 *
 * 
 */
public class FunctionalInterfacesForPrimitives {
	public static void main(String[] args) {
//		suppliers (abstract method: getAsT)
		DoubleSupplier ds = () -> 4.5D; ds.getAsDouble();
		IntSupplier is = () -> 4;		is.getAsInt();
		LongSupplier ls = () -> 4L;		ls.getAsLong();
		
//		consumers (abstract method: accept)
		DoubleConsumer dc = (doubleValue) -> {}; dc.accept(4.5D); 
		IntConsumer ic = (intValue) -> {};		 ic.accept(4);
		LongConsumer lc = (longValue) -> {};	 lc.accept(4L);
		
//		predicates (abstract method: test) 
		DoublePredicate dp = (doubleValue) -> false; dp.test(4.5D);
		IntPredicate ip = (intValue) -> false;		 ip.test(4);
		LongPredicate lp = (longValue) -> false;	 lp.test(4L);
		
//		functions (abstract method: apply)
		DoubleFunction<Object> df = (d) -> null; df.apply(4.5D);
		IntFunction<Object> intf = (i) -> null;	 intf.apply(4);
		LongFunction<Object> lf = (l) -> null;	 lf.apply(4L);
		
//		unary operators (abstract method: applyAsT)
		DoubleUnaryOperator duo = (d) -> 4.5D; duo.applyAsDouble(4.5D);
		IntUnaryOperator iuo = (i) -> 4; iuo.applyAsInt(4);
		LongUnaryOperator luo = (l) -> 4L; luo.applyAsLong(4L);
		
//		binary operators (abstract method: applyAsT)
		DoubleBinaryOperator dbo = (d1, d2) -> 4.5D; dbo.applyAsDouble(4.5D, 4.5D);
		IntBinaryOperator ibo = (i1, i2) -> 4; dbo.applyAsDouble(4, 4);
		LongBinaryOperator lbo = (l1, l2) -> 4L; dbo.applyAsDouble(4L, 4L);
	}
}
