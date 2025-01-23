package com.ag.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.ag.service.Arithimatic;

public class ArithimaticTest {

	private static Arithimatic ar;
	
	@BeforeAll
	public static void setup()
	{
		System.out.println("ArithimaticTest.setup()");
		ar = new Arithimatic();
		
	}
	
	@Test
    public void testwithpositive()
    {
    	
    	float expected = 30.0f;
    	float actual = ar.sum(10.0f, 20.0f);
    	//perform testing
    	assertEquals(expected,actual);
    }
	
	
	@Test
	@Disabled
	public void testwithnegative()
	{
		float expected = 10.0f;
		float actual = ar.sum(-10.0f, 20.0f);
		// perform testing
		assertEquals(expected,actual);
	}
	
	@Test
	public void testwithzeros()
	{
		float expected = 0.0f;
		float actual = ar.sum(0.0f, 0.0f);
		// perform testing
		assertEquals(expected,actual);
	}
	
	@Test 
	public void testwithmixedvalues()
	{
		
		float expected = 10.0f;
		float actual = ar.sum(-10.0f, 20.0f);
		// perform testing
		assertEquals(expected,actual);
	}


	@AfterAll
	public static void tearDown()
	{
		System.out.println("ArithimaticTest.tearDown()");
		ar=null;
	}
	
}
