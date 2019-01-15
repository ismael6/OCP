package edu.ocp.genericsAndCollections.comparatorVsComparable;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author IsmaSp6
 *
 * Is highly recommended that compareTo() -> 0  is consistent with equals() -> true
 */
public class ComparableImpl implements Comparable<ComparableImpl>{

	/*
	 * return 0 -> objects equals
	 * return negative -> current object smaller than argument
	 * return positive -> current object greater than argument
	 * */
	@Override
	public int compareTo(ComparableImpl o) {
		return id - o.id;
	}

	public static void main(String[] args) {
		List<ComparableImpl> l = new LinkedList<>();
		ComparableImpl c1 = new ComparableImpl();
		ComparableImpl c2 = new ComparableImpl();
		c1.id = 10;
		c2.id = 5;
		l.add(c1);
		l.add(c2);
		System.out.println(l); //10, 5
		Collections.sort(l); // uses compareTo
		System.out.println(l); //5, 10
	}
	
	private int id;

	public String toString() {
		return ""+id;
	}
}
