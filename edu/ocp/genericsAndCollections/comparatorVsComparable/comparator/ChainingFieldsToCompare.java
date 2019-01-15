package edu.ocp.genericsAndCollections.comparatorVsComparable.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author IsmaSp6
 * 
 * Comparator provides static and default methods allowing chaining comparators
 *
 */
class CompareChain implements Comparator<ChainingFieldsToCompare>{

	@Override
	public int compare(ChainingFieldsToCompare o1, ChainingFieldsToCompare o2) {
		// compares first by id2 and then compares by id1	
		Comparator<ChainingFieldsToCompare> c = 
				Comparator.comparing(ChainingFieldsToCompare :: getId2)
					.thenComparing(x -> x.getid1());
		
		return c.compare(o1, o2);
	}
}

class ChainingFieldsToCompare {
	public static void main(String[] args) {
		List<ChainingFieldsToCompare> list = new ArrayList<>();
		list.add(new ChainingFieldsToCompare("b", 2));
		list.add(new ChainingFieldsToCompare("a", 1));
		System.out.println(list);
		Collections.sort(list, new CompareChain());
		System.out.println(list);
	}
	
	private String id1;
	private int id2;
	
	public ChainingFieldsToCompare(String id1, int id2) {
		this.id1 = id1;
		this.id2 = id2;
	}
	
	public String getid1() { return id1; }
	
	public int getId2() { return id2;}
	
	public String toString() {
		return id1 +" - "+id2; 
	}
}
