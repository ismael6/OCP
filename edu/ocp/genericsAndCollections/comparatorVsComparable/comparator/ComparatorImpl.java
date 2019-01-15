package edu.ocp.genericsAndCollections.comparatorVsComparable.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author IsmaSp6
 * 
 * works like Comparable, but with a decoupled implementation
 *  - method have different name and signature
 */
public class ComparatorImpl {
	
	public static void main(String[] args) {
		Comparator<ComparatorImpl> comparator = new Comparator<ComparatorImpl>() {
			@Override
			public int compare(ComparatorImpl o1, ComparatorImpl o2) {
				return o1.id - o2.id;
			}
		};
		
		List<ComparatorImpl> list = new ArrayList<>();
		list.add(new ComparatorImpl(5));
		list.add(new ComparatorImpl(3));
		System.out.println(list);
		
//		Collections.sort(list, (o1, o2) -> o1.id - o2.id); // FUNCTIONAL SCOPE

		Collections.sort(list,comparator); // receives the list and the comparator
	
		System.out.println(list);
	}

	public ComparatorImpl(int id) {
		this.id = id;
	}
	
	private int id;

	public String toString() {
		return ""+id;
	}

}
