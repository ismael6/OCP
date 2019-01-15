package edu.ocp.genericsAndCollections.arraysArraylist;

import java.util.Arrays;
import java.util.List;

/**
 * @author IsmaSp6
 * 
 * Arrays.asList(T...) creates copy all elements from array into a new ArrayList
 * as its a linked copy, every change in one reflects on the other
 * and cannot resize the linked copied ArrayList
 */
public class _2ArrayToArraylist {
	public static void main(String[] args) {
		
		Integer[] array = {0,1,2};
//		Arrays.asList(T...) -> creates an arrayList with the elements on array
		List <Integer> arrayListFromArray = Arrays.asList(array);
		for(int i = 0; i < 3; i++) {
			System.out.println("array:"+array[i] + " - arrayListFromArray:" + arrayListFromArray.get(i));
		}
		
		System.out.println();
		
//		Changes on generated ArrayList affects immediately on array and vice versa		
		arrayListFromArray.set(0, 50); 
		array[1] = 100;
		for(int i = 0; i < 3; i++) {
			System.out.println("array:"+array[i] + " - arrayListFromArray:" + arrayListFromArray.get(i));
		}
		
		
//		ArrayList generated with Arrays.asList(T...) can´t change size
//		arrayListFromArray.add(3); //UnsupportedOperationException at runtime
//		arrayListFromArray.remove(0); // UnsupportedOperationException at runtime
	}
}
