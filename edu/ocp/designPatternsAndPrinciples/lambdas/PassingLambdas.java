package edu.ocp.designPatternsAndPrinciples.lambdas;

/**
 * @author IsmaSp6
 *
 */
@FunctionalInterface
interface ApprovalContract{
	boolean approval(Student student); 
}

class PassingLambdas {
	
	public static void main(String[] args) {	
		//********* ApprovalContract lambda implementations *****
		ApprovalContract middleSchoolApproval = 
				studentMiddle -> studentMiddle.getNote() > 7;
		
		ApprovalContract highSchoolApproval = 
				studentHigh -> studentHigh.getNote() > 70;
				
		ApprovalContract kinderGardenApproval = 
				studentKinder -> true;
		//*******************************************************
				
		Student student = new Student(Byte.valueOf("9"));
		
		evaluate(student, middleSchoolApproval);
		evaluate(student, highSchoolApproval);
		evaluate(student, kinderGardenApproval);
	}
	
	//	Uses lambda implementation of ApprovalContract interface
	private static void evaluate(Student student, ApprovalContract lambdaImplementation) {
		if(lambdaImplementation.approval(student)) {
			System.out.println("Passes");
		}
		else {
			System.out.println("Not passes");
		}		
	}
}

class Student{
	
	private byte note;
	
	Student(byte note){
		this.note = note;
	}
	
	public byte getNote() {
		return note;
	}
}
