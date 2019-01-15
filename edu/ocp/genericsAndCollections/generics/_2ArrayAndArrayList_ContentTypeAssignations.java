package edu.ocp.genericsAndCollections.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author IsmaSp6
 *
 */
public class _2ArrayAndArrayList_ContentTypeAssignations {
	public static void main(String[] args) {
		
		List<Number> numbersList = new ArrayList<>();
//		List<Object> objectsList = numbersList; //CAN´T point List<Object> reference to List<Number> instance (different types) 
		
		Number[] numbersArray = new Number[1];
		Object[] objectsArray = numbersArray; //ALLOWS point Object[] reference to Number[] instance (different types but allowed)
		objectsArray[0] = new Object(); // throws ArrayStoreException at runtime (the instance is Number[] type)
	}
}
