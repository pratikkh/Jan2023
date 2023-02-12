package com.practice.jan2023;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class ArithmaticOperationsTest {

	ArithmaticOperations a;

	@org.junit.BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
	}

	@Before
	public void setUp() throws Exception {
		a = new ArithmaticOperations();
		System.out.println("before");
	}

	@Test
	public void testAdd() {
		int actualOutcome = a.add(2, 2);
		Assert.assertEquals(4, actualOutcome);
	}

	@Test
	public void testAddNonPositiveNumbers() {
		int actualOutcome = a.add(2, -2);
		Assert.assertEquals(0, actualOutcome);

	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after");
	}

	@org.junit.AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after class");
	}
}
