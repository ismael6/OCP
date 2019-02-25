package edu.ocp.io.streams.objects.serialization;

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
 * On Serialization / Deserialization the field:
 * if is transient -> value is lost (keeps with the default initialization value)
 * if is static -> all field from objects keeps with the last value of the field object readed/writed
 * 
 * 	+ CONSTRUCTORS AND INITIALIZER BLOCKS ARE IGNORED
 *
 */
public class DataOnSerialization {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		List<A> as = new ArrayList<>();
		as.add(new A("first", 1, '1'));
		as.add(new A("second", 2, '2'));
		
		String parentPath = System.getProperty("user.dir");
		File file = new File(parentPath, "src/edu/ocp/io/file.txt");
		serialize(as, file);
		System.out.println(deserialize(file));
		
	}
	
//	Converts from stream to Objects
	public static List<A> deserialize(File dataFile) throws FileNotFoundException, IOException, ClassNotFoundException{
		List<A> as = new ArrayList<>();
		try(ObjectInputStream ois = 
				new ObjectInputStream( // works with an InputStream
						new BufferedInputStream( // optimizes reading operation
								new FileInputStream(dataFile)))){ // directly reads on file
			while (true) { // exit on Exception only
				Object obj = ois.readObject(); // DESERIALIZES objects from ObjectInputStream (THROWS ClassNotFoundException) 
//				if(obj instanceof A) { 
					as.add((A)obj);
//				}
			}
		}
		catch(EOFException e) { //read operation reached end of file 
			System.out.println("end of file");
		} 
		return as;
	}

//	converts from Objects to stream
	public static void serialize(List<A> as, File file) throws FileNotFoundException, IOException {
		try(ObjectOutputStream oos = 
				new ObjectOutputStream( // works with an OutputStream
						new BufferedOutputStream( // optimizes writing operation
								new FileOutputStream(file)))){ // directly writes on file
			for(A a : as) {
				oos.writeObject(a); // SERIALIZES objects to the ObjectOutputStream
			}
		}
	}
}

class A implements Serializable{

	private static final long serialVersionUID = -3796524573892366950L;

	private transient String a;
	private int b;
	private static char c;
	
	{
		this.a="on instace initializer";
	}
	
	public A() {
		this.a = "String";
		this.b = 100;
		A.c = '1';
	}
	
	public A(String a, int b, char c) {
		this.a = a;
		this.b = b;
		A.c = c;
	}
	
	public String getA() {return a;}
	
	public int getB() {return b;}
	
	public char getC() {return c;}
	
	public String toString() {
		return "A [a= "+a+", b= "+b+" c= "+c+"]";
	}
}
