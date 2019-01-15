package edu.ocp.designPatternsAndPrinciples.designPatterns.immutableObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author IsmaSp6
 *
 */
// class marked as final
public final class ImmutableObject {
	
//	All fields marked as private final
	private final int a;
	private final List<Integer> list;
	
//	Values only assigned on constructor
	public ImmutableObject(int a, List<Integer> list) {
		this.a = a;
		if(list == null) {
			throw new RuntimeException("list is required");
		}
//		If value is a mutable reference, always creates a new instance (this way avoids the caller modifying with his reference)
		this.list = new ArrayList<>(list);
	}

//	DON´T INCLUDE SETTER METHODS

//	If getter is on a mutable reference, always creates a new instance (this way avoids the caller modifying with this reference) 
	public List<Integer> getList() {
		if(list == null) {
			throw new RuntimeException("list is required");
		}
		return new ArrayList<>(list);
	}
	
	public int getA() {
		return a;
	}
}
