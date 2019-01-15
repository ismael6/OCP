package edu.ocp.genericsAndCollections.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author IsmaSp6
 *
 */
class RawTypes {
	public static void main(String[] args) {
//********adding elements of different type into a parameterized list***************
		List<Integer> list = new ArrayList<>();
		// bad practice (method parameter is a raw type, types unsafe)		
		addStringElementRawList(list); 
		// bad practice (method parameter is a raw type, types unsafe)
		addCharacterElementRawList(list);
		System.out.println("first element in List<Integer> "+list.get(0));
		System.out.println("second element in List<Integer> "+list.get(1));
//*********************************************************************************
		
		List rawList = new ArrayList();
		rawList.add(5);
		rawList.add(new RawTypes());
//		int var = rawList.get(0); // not compiles, rawList default values are Object type
	}

	// compiler warning if generics are not defined
	private static void addStringElementRawList(List list) {
		list.add("string");
	}

	// compiler warning if generics are not defined
	private static void addCharacterElementRawList(List list) {
		list.add(new Character('C'));
	}
}
