package edu.ocp.genericsAndCollections.arraysArraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * @author IsmaSp6
 * 
 * Creates an independent array copy from an ArrayList
 * ArrayList.toArray() -> array of Object elements
 * ArrayList.toArray(T[n]) -> array of T elements
 * 	if "n" <= than ArrayList.size() -> array of T elements length is equals to ArrayList.size()
 *  if "n" > than ArrayList.size() -> array of T elements length is equals to n (filling with null elements)
 */
public class _2ArraylistToArray {
	
	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		
//		ArrayList.toArray() method returns an array of Object elements
		Object[] arrayObject = arrayList.toArray();
		System.out.println(arrayObject.length);
		
//		ArrayList.toArray(T[]) method returns an array of T
/*		If the size of T[] is lower or equal than the size of List to copy, 
		the size of the returning array is equals than the original List */
		Integer[] array1 = arrayList.toArray(new Integer[1]);		
		System.out.println(array1.length);

/*		If the size of T[] is bigger than the size of List to copy, 
		the size of the returning array is equals than the size of T[] 
		(filling with null values)*/
		Integer[] array10 = arrayList.toArray(new Integer[10]);
		System.out.println(array10.length);
		
//		Changes on ArrayList and array copied, are independent
		array1[0] = 1000;
		System.out.println("array1[0] = "+array1[0]);
		System.out.println("arrayList.get(0) = "+arrayList.get(0));
	}
}
