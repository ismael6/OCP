package edu.ocp.genericsAndCollections.arraysArraylist;

import java.util.Arrays;

/**
 * @author IsmaSp6
 *
 * The same sort/search rules apply for Arraylist and array
 * 	array uses Arrays.sort() / Arrays.binarySearch()
 *  ArrayList uses Collections.sort() / Collections.binarySearch()
 */
public class _3SearchingAndSorting {
	public static void main(String[] args) {
		int[] numbers = {6,9,1,8,2,6};

//		ALWAYS SORT before searching or the search result is undefined
		Arrays.sort(numbers);

//		If the element exists, returns the index of any matching element
		System.out.println(Arrays.binarySearch(numbers, 6)); //2
		
//		If the element DON´T exists, return the negative index where it should be allocated minus 1
//		result = [(-1)(index)]-1
		System.out.println(Arrays.binarySearch(numbers, 3));
		
	}
}
