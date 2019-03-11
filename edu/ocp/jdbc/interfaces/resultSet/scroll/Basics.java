package edu.ocp.jdbc.interfaces.resultSet.scroll;

/**
 * @author IsmaSp6
 * 
 * 	'ResultSet.TYPE_SCROLL_INSENSITIVE' or 'ResultSet.TYPE_SCROLL_SENSITIVE'
 *  
 * 
 * 	next()	  	 :boolean -> moves cursor pointing to the next row
 * 	previous()	 :boolean -> moves cursor pointing to the previous row
 * 	first()	  	 :boolean -> moves cursor pointing to the first row
 * 	last()	  	 :boolean -> moves cursor pointing to the last row
 * 	beforeFirst():void 	  -> moves cursor pointing before the first row
 * 	afterLast()	 :void 	  -> moves cursor pointing after the last row
 * 
 * 	absolute(int):boolean
 * 		0 -> moves cursor pointing before the first row
 * 		1 to n -> moves cursor pointing on the correspondent row (counting from begin to end) 
 * 		-1 to -n -> moves cursor pointing on the correspondent row (counting from end to begin)
 *	relative(int):boolean
 *		moves cursor forwards(1 to n) or backwards (-1 to -n) elements on the resultSet
 *	
 */
public class Basics {
	public static void main(String[] args) {
		
	}
}
