package com.ezitapps;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CircleTest {
	
	Circle myCircle;

	@Before
	public void setUp() throws Exception {
		myCircle = new Circle();
	}

	@After
	public void tearDown() throws Exception {
		myCircle = null;
	}
	
	@Test
	public void testConstructorDefault(){
		assertEquals(0.0, new Circle().getAreaCircle(), 3);
	}

	

}
