/**
 * 
 */
package org.springdemo.examples;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author sayed
 *
 */
public class MainTest extends TestCase {

	/**
	 * @param name
	 */
	public MainTest(String name) {
		super(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}
	public static Test suite()
    {
        return new TestSuite( MainTest.class );
    }
	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for
	 * {@link org.springdemo.examples.Main#main(java.lang.String[])}.
	 */
	public void testMain() {
		assertTrue(true);
	}

}
