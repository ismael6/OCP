package edu.ocp.genericsAndCollections.generics.methods;

/**
 * @author IsmaSp6
 * 
 * Method/constructor generic types are defined AFTER THE MODIFIERS part
 * 
 */
public class GenericsToMethods implements Parent{
	
	public static void main(String[] args) {
//		calling syntax style 1: omitting actual generic types (infers by parameter type)
		GenericsToMethods.m1(new GenericsToMethods(new Object(), new Integer(6).getClass()));
//		calling syntax style 2: explicitly specifying actual generic type
		GenericsToMethods.<Integer>m1(8);
		
//		BasicRules.<Integer>m1("WRONG"); // not compiles, incompatible ACTUAL GENERIC TYPE and PARAMETER TYPE
	}
	
	
//	Generics can defined to constructor
	public <M, N> GenericsToMethods(M var, N o) {}

//	Generics can be defined to static/instance methods 
	public static <L> GenericsToMethods m1(L l) {
		System.out.println(""+l);
		return new GenericsToMethods(l, l);
	}
	
//	********************** Overriding method with generic types defined**********************
//	if method overrides another method with generic type, it can keep FORMAL GENERIC TYPE
	@Override
	public <Y> void m5(Y i) {}
	
//	if method overrides another method with generic type, it can omits GENERIC TYPE (Object type is set by default)
	@Override
	public void m6(Object i) {}
//	*****************************************************************************************	
}

interface Parent{
	public <T> void m5(T i);
	public <U> void m6(U i);
}
