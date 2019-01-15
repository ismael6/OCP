package edu.ocp.genericsAndCollections.listsSetsMApsQueues;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * @author IsmaSp6
 *
 * interfaces List, Set and Queue extends Collection
 * interface Map DON`T extend Collection
 * 
 * ************************NOTE*******************************
 *  Ordered ->  ordered by index of data structure
 *  Sorted -> ordered by element property
 * ***********************************************************
 */
public class _1GeneralRules {
//	Provides common methods
	Collection<Object> collection;
	
//	Ordered and allows duplicates, access elements by int index
	List<Object> listExtendsCollection;
	
//	Not allow duplicates
	Set<Object> setExtendsCollection;
	
//	Specific nature processing order (FIFO, LIFO)
	Queue<Object> queueExtendsCollection;
	
//	Contains key-value pairs, no duplicate keys allowed
	Map<Object, Object> map;
}
