package com.hcl.junit;

import junit.framework.TestCase;

public class Calculationtest extends TestCase {
	private int val1;
	private int val2;

	public Calculationtest(String testName) {
		super(testName);
	}

	protected void setUp() throws Exception {
		super.setUp();
		val1 = 3;
		val2 = 2;
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		val1 = 0;
		val2 = 0;
	}

	public void testAdd() {
		int sum = 5;
		int getsum = Calculation.add(val1, val2);
		assertEquals(getsum, sum);
	}

	public void testFailedAdd() {
		int sum = 6;
		int getsum = Calculation.add(val1, val2);
		assertNotSame(getsum, sum);
	}

	public void testSub() {
		int sub = 1;
		int getsub = Calculation.sub(val1, val2);
		assertEquals(getsub, sub);
	}

	public void testFailedSub() {
		int sub = 2;
		int getsub = Calculation.sub(val1, val2);
		assertNotSame(getsub, sub);
	}

}
