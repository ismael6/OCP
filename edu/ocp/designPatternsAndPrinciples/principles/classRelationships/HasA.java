package edu.ocp.designPatternsAndPrinciples.principles.classRelationships;

/**
 * @author IsmaSp6
 *
 * "Has A" refers to composition classes and is a big tool for delegating behavior to another objects 
 */
public class HasA {
	Tire tire = new Tire();
	Engine engine = new Engine();
	Car car = new Car(tire, engine);
}

class Car{
	private Tire tire;
	private Engine engine;
	
	Car(Tire tire, Engine engine){
		this.tire = tire;
		this.engine = engine;
	}
}

class Tire{
	
}

class Engine{
	
}