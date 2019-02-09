package edu.ocp.exceptionsAndAssertions.assertions;

/**
 * @author IsmaSp6
 *
 * Enable assertions with '-enableassertions' or '-ea' on virtual machine arguments
 * Disable assertions with '-disableassertions' or '-da' on virtual machine arguments
 * 
 * java -ea programName -> enable assertions on all classes except System classes (provided java runtime classes)
 * java -ea:com.test... programName -> enable assertions on any class on test packages or subpackages
 * java -ea:com.test.BasicTest programName -> enable assertions on BasicTest class only
 * java -ea:com.test... -da:com.test.BasicTest programName -> enable assertions on any class on test packages or subpackages except for BasicTestClass
 * 
 */
public class EnableDisableAssertions {

}
