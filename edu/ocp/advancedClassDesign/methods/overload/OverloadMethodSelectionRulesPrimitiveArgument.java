package edu.ocp.advancedClassDesign.methods.overload;

/**
 * @author IsmaSp6
 * Overloading method rules selection for primitive parameters
 *
 */
class OverloadMethodSelectionRulesPrimitiveArgument {

	/**
	 * Overload Rules method choices priority:
	 * 
	 */
	public static void main(String... strings){
        a(0);
    }
     
	
     /**
     * 1.- Exact match
     */
//    static void a(int a){
//         System.out.println("int");
//    }
     
     /**
     * 2.- Widening
     */
//    static void a(long a){
//         System.out.println("long");
//    }
        
    /**
     * 3.- Boxing
     */
//    static void a(Integer a){
//        System.out.println("Integer");
//    }
   
    /**
    * 4.- Upcasting
    */
//   static void a(Number a){
//        System.out.println("Number");
//    }
     
     /**
     * 5.- VarArgs
     */
   static void a(int... a){
	   System.out.println("int...");
   }
          
     
     /**
     * NOT INVOKING
     * (numeric promotion + boxing)
     * ONLY ONE STEP TRANSFORMATION ALLOWED
     */
    static void a(Long a){
    	System.out.println("Long");
    }

    /**
     * ************************************************
     * NOT COMPILING if @5 commented (AMBIGUOUS) 
     * have same priority 
     */
//    static void a(long... a){
//    	System.out.println("long...");
//    }
    
//    static void a(Integer... a){
//    	System.out.println("Integer...");
//    }
    /**
     * ************************************************* 
     */
}
