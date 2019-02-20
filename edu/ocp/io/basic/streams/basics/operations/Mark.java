package edu.ocp.io.basic.streams.basics.operations;

/**
 * @author IsmaSp6
 *
 *	mark(int), reset(), markSupported()
 *	InputStream/Reader have those methods
 *	Useful to move the stream cursor back to an earlier position
 *	markSupported() -> returns true if the input stream supports mark()
 *		If not supported and called mark() throws Exception at Runtime
 *	mark(int range) -> places a 'checkpoint' and establishes a read-ahead limit
 *	reset() -> places the cursor on the marked checkpoint
 *	
 */
public class Mark {
}
