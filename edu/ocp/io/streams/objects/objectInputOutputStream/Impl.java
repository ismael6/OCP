package edu.ocp.io.streams.objects.objectInputOutputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author IsmaSp6
 *
 *	Serialization -> convert an in-memory object to a stored data format
 *	Deserialization -> convert stored data format into an in-memory object
 */
public class Impl {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		List<AA> as = new ArrayList<>();
		as.add(new AA("first", 1, '1'));
		as.add(new AA("second", 2, '2'));
		as.add(null);		             // null can be serialized / deserialized too
		
		String parentPath = System.getProperty("user.dir");
		File file = new File(parentPath, "src/edu/ocp/io/file.txt");
		serialize(as, file);
		System.out.println(deserialize(file));
		
	}
	
//	Converts from stream to Objects
	public static List<AA> deserialize(File dataFile) throws FileNotFoundException, IOException, ClassNotFoundException{
		List<AA> as = new ArrayList<>();
		try(ObjectInputStream ois = 
				new ObjectInputStream( // works with an InputStream
						new BufferedInputStream( // optimizes reading operation
								new FileInputStream(dataFile)))){ // directly reads on file
			while (true) { // exit on Exception only
				Object obj = ois.readObject(); // DESERIALIZES objects from ObjectInputStream (THROWS ClassNotFoundException) 
//				if(obj instanceof A) { 
					as.add((AA)obj);
//				}
			}
		}
		catch(EOFException e) { //read operation reached end of file 
			System.out.println("end of file");
		} 
		return as;
	}

//	converts from Objects to stream
	public static void serialize(List<AA> as, File file) throws FileNotFoundException, IOException {
		try(ObjectOutputStream oos = 
				new ObjectOutputStream( // works with an OutputStream
						new BufferedOutputStream( // optimizes writing operation
								new FileOutputStream(file)))){ // directly writes on file
			for(AA a : as) {
				oos.writeObject(a); // SERIALIZES objects to the ObjectOutputStream
			}
		}
	}
}

class AA implements Serializable{

	private static final long serialVersionUID = -3796524573892366950L;

	private String a;
	private int b;
	private char c;
	
	public AA(String a, int b, char c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public String getA() {return a;}
	
	public int getB() {return b;}
	
	public char getC() {return c;}
	
	public String toString() {
		return "AA [a= "+a+", b= "+b+" c= "+c+"]";
	}
}
