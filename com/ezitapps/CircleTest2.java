package com.ezitapps;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CircleTest2 {
	
	Circle myCircle2;

	@Before
	public void setUp() throws Exception {
		myCircle2 = new Circle(2);
		
	}

	@After
	public void tearDown() throws Exception {
		myCircle2 = null;
	}

	@Test
	public void testConstructor(){
		assertEquals(2, myCircle2.getRadius());
		assertEquals(12.5663706, myCircle2.getAreaCircle(), 0.00001);
	}

}
