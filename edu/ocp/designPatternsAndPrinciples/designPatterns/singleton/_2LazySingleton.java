package edu.ocp.designPatternsAndPrinciples.designPatterns.singleton;

/**
 * @author IsmaSp6
 *
 * Lazy instantiation: creates object until required
 */
public class _2LazySingleton {
	
/*  Lazy instantiation forces to take out the "final" modifier,
 *	this carry concurrency troubles (getInstance() called twice the first time) */
	private static /*final*/ _2LazySingleton singleton;
	
	private _2LazySingleton() {}
	
/*	Solves concurrency troubles using the "synchronized" modifier, 
 * 	this grants Thread safety again */
	public static synchronized _2LazySingleton getInstance() {
		if(singleton == null) {
			singleton = new _2LazySingleton();
		}
		return singleton;
	}
}
