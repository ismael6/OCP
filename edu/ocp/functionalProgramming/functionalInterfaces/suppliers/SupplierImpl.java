package edu.ocp.functionalProgramming.functionalInterfaces.suppliers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

/**
 * @author IsmaSp6
 *
 * Parameterized types -> T
 * parameters -> {}
 * returns -> T
 * method name -> get
 * 
 */
public class SupplierImpl {
	public static void main(String[] args) {
		Supplier<LocalDate> dateSupplier = LocalDate::now;
		Supplier<LocalDate> dateSupplier1 = () -> LocalDate.now();
		
		Supplier<ArrayList<String>> listSupplier = ArrayList::new;
		Supplier<ArrayList<String>> listSupplier2 = () -> new ArrayList();
		
		System.out.println(listSupplier); // refers to lambda
		System.out.println(listSupplier.get()); // refers to applying lambda
	}
}
