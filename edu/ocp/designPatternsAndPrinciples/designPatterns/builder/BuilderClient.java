package edu.ocp.designPatternsAndPrinciples.designPatterns.builder;

import edu.ocp.designPatternsAndPrinciples.designPatterns.builder.Animal.Builder;

class BuilderClient{
	public static void main(String[] args) {
	/*	Creating the object with builder object consist on 
		chaining his setters as needed and finally calling build() method */
		Animal animal = new Builder().setA(1).setB(2).setC(3).build();
	}
}

// Target class
class Animal {
	private int a;
	private int b;
	private int c;
	
//	private scope is NOT mandatory on target class
	private Animal(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	
/*	Builder is a copy of target class fields with the setters returning "this"
	and a build() method invoking constructor of target class and returning the target object */
	static class Builder{
		
		private int a;
		private int b;
		private int c;

		public Builder setA(int a) {
			this.a = a;
			return this;
		}
		public Builder setB(int b) {
			this.b = b;
			return this;
		}
		public Builder setC(int c) {
			this.c = c;
			return this;
		}
		
		public Animal build() {
			return new Animal(a, b, c);
		}
	}
}
