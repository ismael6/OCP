package edu.ocp.nio2.operations;

/**
 * @author IsmaSp6
 * 
 * 	NOFOLLOW_LINKS -> symbolic links will NOT be traversed
 * 		used in: 
 * 			+ test file existing
 * 			+ read file data
 * 			+ copy file
 * 			+ move file
 * 	FOLLOW_LINKS -> symbolic links will be traversed
 * 		used in:
 * 			+ traverse directory tree
 * 	COPY_ATTRIBUTES -> copy file with all its metadata
 * 		used in:
 * 			+ copy file
 * 	REPLACE_EXISTING -> if not provided and file exists, throw Exception
 * 		used in:
 * 			+ copy file
 * 			+ move file
 * 	ATOMIC_MOVE -> performs operation in an atomic manner within file system
 * 					throw Exception if file system not support atomic operations
 * 		used in:
 * 			+ move file
 *
 */
public class OptionalFlags {}
