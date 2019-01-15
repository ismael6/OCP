package edu.ocp.genericsAndCollections.arraysArraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * @author IsmaSp6
 * 
 * array is a built in data structure
 * ArrayList is a Java class
 */
public class _1ArrayVsArraylist {
	
	public static void main(String[] args) {
		
//		arrays have a defined size
		Integer[] array = new Integer[3];
//		arrays CAN contain primitive values
		int[] arrayPrimitives = new int[3];

//		ArrayList grows dinamically 
		List<Integer> arrayList = new ArrayList<>();
//		ArrayList CAN´T contain primitive values
//		List<int> arrayListPrimitives = new ArrayList<>(); // not compiles
		
		System.out.println("array size -> length property: "+array.length);
		System.out.println("ArrayList size -> size() method: "+arrayList.size());
		
		array[0] = 1;
		arrayList.add(1);
		
		System.out.println("array access elements by index -> array[0]: "+array[0]);
		System.out.println("ArrayList access elements with get(int) method -> arrayList.get(0): "+arrayList.get(0));
	}
}
