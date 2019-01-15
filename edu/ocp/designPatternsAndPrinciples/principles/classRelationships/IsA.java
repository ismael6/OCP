package edu.ocp.designPatternsAndPrinciples.principles.classRelationships;


/**
 * @author IsmaSp6
 *
 * The "IsA" relationship is about the typification of the referred class 
 * (every class IS A of any upper class in his hierarchy tree)
 */
public class IsA {
	Cat cat = new Cat();
	Feline feline = new Cat();
	Pet pet = new Cat();
}

class Cat extends Feline implements Pet{
	
}

class Feline{
	
}

interface Pet{
	
}