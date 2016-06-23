package com.peacock.stackdemo;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	StringStack stack = new StringStack();

	public void testPop() {
		stack.push("v1");
		assertEquals("v1", stack.pop());
		stack.push("v2");
		stack.push("v3");
		assertNotSame("v2", stack.pop());

	}
}
