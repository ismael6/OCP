package edu.ocp.genericsAndCollections.listsSetsMApsQueues.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author IsmaSp6
 *
 * Operations on List interface uses indexes
 */
public class _1ListCommonMethods {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		
		list.add(0, new Object()); //returns void
		list.get(0);
		list.indexOf(new Object()); //returns first matching index or -1 if not
		list.lastIndexOf(new Object()); //returns last matching index or -1 if not
		list.remove(0); // returns element removed, throws exception if index don´t exist
	}
}
