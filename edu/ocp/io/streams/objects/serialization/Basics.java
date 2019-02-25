package edu.ocp.io.streams.objects.serialization;

/**
 * @author IsmaSp6
 *
 *	Implements from java.io.Serializable interface
 *		Informs any process attempting to serialize, that the object is properly Serializable
 *		tagging marking interface (there are no required methods to implement)
 *	
 *	transient -> marks element as non-serializable (this data is lost on Serialization/Deserialization process)
 *	
 *	NotSerializableException:
 *		If the class to Serialize/Deserialize or its HAS A elements are not Serializable or transient
 *
 *	transient and static members are ignored on Serialization/Deserialization process
 *
 *	serialVersionUID -> ID to identify the version of the class
 */
public class Basics {
	public static void main(String[] args) {
		
	}
}
